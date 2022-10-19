
   
   import React from 'react'
  
   import {useState , useEffect} from "react";
   import axios from "axios";

   import {Link} from "react-router-dom";

   import style from "../SubjectComponent/Subject.module.css";

   

     const UserList=()=>{

       const [Users , setUsers] = useState([]);

       useEffect(()=> {
        const getAllUser=async()=>{
           let value = await axios.get(`http://localhost:8082/user`);
           setUsers(value.data);
         }
         getAllUser();
       },[])

         return (
             <>
               <div id={style.displayHeadingBox}> 
                   <h2>User List</h2>     
                </div>

                
                   <table class="table">
                      <thead>
                         <tr>
                         <th scope="col">Sr.no.</th>
                            <th scope="col">User Name</th>
                            <th scope="col">User Email</th>
                            <th scope="col">Options</th>
                         </tr>
                       </thead>
                       <tbody>
                         {
                           Users.map((data , i) => {
                             return(
                              <tr key={i}>
                                 <td>{i+1}</td>
                                 <td>{data.name}</td> 
                                 <td>{data.email}</td> 
                                 <td>
                                   <Link exact to={`/UserDashboard/UserResult`}>
                                     <button className="btn btn-light">View Result</button> 
                                   </Link>
                                   </td>
                             </tr>
                             );
                           })
                         }
                           
                        </tbody>
                    </table>
                
             </>
         );
     }

     export default UserList;