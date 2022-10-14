
   
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

                <div id={style.tableBox}>
                   <table>
                      <thead>
                         <tr>
                            <th id={style.center}>User Name</th>
                            <th id={style.center}>User Email</th>
                            <th id={style.center}>Options</th>
                         </tr>
                       </thead>
                       <tbody>
                         {
                           Users.map((data , i) => {
                             return(
                              <tr key={i}>
                                 <td>{data.name}</td> 
                                 <td>{data.email}</td> 
                                 <td>
                                   <Link exact to={`/AdminDashboard/UserList/Details/${data.email}`}>
                                     <button>View Result</button> 
                                   </Link>
                                   </td>
                             </tr>
                             );
                           })
                         }
                           
                        </tbody>
                    </table>
                </div>
             </>
         );
     }

     export default UserList;