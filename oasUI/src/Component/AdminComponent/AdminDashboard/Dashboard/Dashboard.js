import React from 'react'
 
   import style from "./Dashboard.module.css";
   import {useState  , useEffect} from "react";
   import { useNavigate } from "react-router-dom";
   import axios from "axios";

   

    const Dashboard=()=>
     {

          const [exam , setExam] = useState("Updating...");
          const [question , setQuestion] = useState("Updating...");
          const [user , setUser] = useState("Updating...");

            useEffect(() => {
                const getAllExam=async()=>{
                    let value  = await axios.get(`http://localhost:8082/exam`);
                    setExam("We have total " +value.data.length + " exam");
                }
                getAllExam();


                const getAllQuestions=async()=>{
                    let value  = await axios.get(`http://localhost:8082/question`);
                    setQuestion("We have total " +value.data.length + " question");
                }
                getAllQuestions();


               const getAllUsers=async()=>{
                    let value  = await axios.get(`http://localhost:8082/user`);
                    setUser("We have total " +value.data.length + " user");
                }
                getAllUsers();
            })

 
             const navigate=useNavigate();

            function showExam(){
                navigate("/AdminDashboard/Exam");
            }

            function showQuestions(){
               navigate("/AdminDashboard/Question");
            }

            function showUsers(){
                navigate("/AdminDashboard/UserList");
            }


         return(
             <>
                           <div id={style.displayHeadingBox}> 
                               <h1>Dashboard</h1>     
                           </div>

                            <div id={style.box1}>
                               <p id={style.countOfExam}>{exam}</p>
                                   <button onClick={showExam}>View Details</button>
                            </div>

                              <div id={style.box2}>
                                  <p  id={style.countOfQuestion}>{question}</p>
                                   <button onClick={showQuestions}>View Details</button> 
                              </div>

                              <div id={style.box3}>
                                  <p id={style.countOfUser}>{user}</p>
                                    <button onClick={showUsers} >View Details</button>
                              </div>
                             
             </>
         );
     }

     export default Dashboard;