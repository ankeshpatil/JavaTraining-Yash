
   import React from 'react'
   
   import style from "../../SubjectComponent/Subject.module.css";

   import axios from "axios";

   import {useEffect , useState} from "react";
   import { useNavigate, useParams} from "react-router-dom";


    
    function Details(){
        
        const {id} = useParams();

        const [exam  , setExam] = useState({
            name:"",
            desc:"",
            level:"",
            passMarks:"",
            totalQuestion:"",
            marks:"",
            date: ""
        });

        useEffect(() => {
          
             const getExamDetails=async()=>{
                const value = await axios.get(`http://localhost:8082/exam/${id}`);
                setExam(value.data);
             }
             getExamDetails();
        },[id])

   // -------------------------Go back function---------------------------------------
     
      const navigate=useNavigate();
    
      function handleGoBack(){
          navigate("/AdminDashboard/Exam");
      }


        return (
            <>
                <div id={style.displayHeadingBox}> 
                     <h2>Exam Details</h2>     
                 </div>

                
                     <table className='table' >
                         <thead >
                              <tr>
                                <th scope="col">Exam Name</th>
                                <td > {exam.name.name} </td>
                             </tr>

                              <tr>
                                <th scope="col">Exam Description</th>
                                <td > {exam.desc} </td>
                              </tr>

                               <tr>
                                  <th scope="col">Exam Creation Date</th>
                                  <td > {exam.date} </td>
                               </tr>

                               <tr>
                                  <th scope="col">Exam TotalMarks</th>
                                  <td > {exam.marks} </td>
                               </tr>

                               <tr>
                                  <th scope="col">Exam TotalQuestion</th>
                                  <td > {exam.totalQuestion} </td>
                               </tr>

                               <tr>
                                  <th scope="col">Exam PassMarks</th>
                                  <td > {exam.passMarks} </td>
                               </tr>

                               <tr>
                                  <th scope="col">Exam Level</th>
                                  <td > {exam.level} </td>
                               </tr>
                            </thead>
                         </table>
                   

                    <div id={style.addSubjectBox}>
                       <button onClick={handleGoBack}>Go Back</button>
                   </div>
            </>
        );
    }

    export default Details;