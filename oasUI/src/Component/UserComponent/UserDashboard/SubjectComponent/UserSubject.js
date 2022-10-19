
   
   import style from "../UserDashboard.module.css";

   import {useState , useEffect} from "react";
   import axios from "axios";

   import {NavLink} from "react-router-dom";

   


   const UserSubject=()=>{

        const [allSubject , setAllSubject] = useState([]);

        useEffect(() => {
            async function getAllSubject(){
                let value = await axios.get(`http://localhost:8082/subject`);
                setAllSubject(value.data);
            }
            getAllSubject();
        },[])


       return (
             <>
                <div id={style.displayBoxHeadingBox}>
                     <h1>Choose Subjects</h1>
                </div>

                {
                    allSubject.map((data , i) => {
                        return (
                            <div id={style.displayBoxSubjectBox} key={i}>

                               <div id={style.subjectText}>
                                   <span>{data.name}</span>
                               </div>

                              <div id={style.subjectButton}>
                                   <NavLink exact to={`/UserDashboard/Exam/${data.name}`}> 
                                     <button>Go to Exam</button>
                                   </NavLink>
                              </div>
                         </div>
                        );
                    })
                }
             </>
       );
   }

  export default UserSubject;