

   import axios from "axios";
   import React, {useState , useEffect} from "react"; 

   
   import style from "../UserDashboard.module.css";




const UserResult=()=> {

    const [results , setResults] = useState([]);

     useEffect(()=>{    
        async function getAllResults(){
            // let value = await axios.get(`http://localhost:8082/result/${sessionStorage.getItem("User.email")}`);
            let value = await axios.get(`http://localhost:8082/result/akshay@gmail.com`);
            
            setResults(value.data);
            console.log(value.data);
            console.log("email")
        }
            getAllResults();
     },[]);


    return (
        <>
            <div id={style.displayHeadingBox}>
                <h2>User Exam List</h2>
            </div>
            
                <table class="table" >
                    <thead>
                        <tr>
                             <th scope="col">User Email</th>
                             <th scope="col">Exam Name</th>
                             <th scope="col">Exam Date</th>
                             <th scope="col">Result Status</th>
                             <th scope="col">Your Score</th>  
                             <th scope="col">Total Marks</th>
                             <th scope="col">Total Question</th>  
                        </tr>
                    </thead>
                    <tbody >
                    {
                        results.map((data , i) => {
                                    return(
                                          <tr  key={i}>
                                              <td>{data.email.email}</td>
                                              <td>{data.sname.name}</td>
                                              <td>{data.edate}</td>
                                              <td>{data.status}</td>
                                              <td>{data.score}</td>
                                              <td>{data.totalMarks}</td>
                                              <td>{data.totalQuestion}</td>
                                          </tr>
                                    );

                                })
                            }

                    </tbody>
                </table>
           
        </>
    );
}

export default UserResult;