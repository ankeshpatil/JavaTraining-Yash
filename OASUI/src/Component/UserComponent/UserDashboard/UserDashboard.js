
   import { useNavigate } from "react-router-dom";
   import { useEffect } from "react";
   import {Routes,Route} from 'react-router-dom'
   import { NavLink } from "react-router-dom";
   import style from "./UserDashboard.module.css"
   import UserSubject from "./SubjectComponent/UserSubject";
   import Test from "./TestComponent/Test";
   import UserExam from "./ExamComponent/UserExam";
   import UserResult from "./ResultComponent/UserResult";


    const UserDashboard=()=>{
    console.log("in userDashboard");
       
        useEffect( () => {
                if(sessionStorage.getItem("user") == null){
                    alert("Detect Illegal Way of Entering");
                    navigate("/userlogin");
                }
        })


        const navigate = useNavigate();

         function logout(){
             sessionStorage.clear();
            navigate("/userlogin");
         }
        

         
          return (
              <>
           
                 <div id={style.header}>
                
                      <div id={style.headerHeadingBox}>
                          <h3>Online Exam System</h3> 
                      </div>

                        <div id={style.headerMenuBox}>
                            <NavLink exact to="/UserDashboard/UserSubject"> <span>Subject</span> </NavLink>
                            <NavLink exact to="/UserDashboard/UserResult" > <span>My Result</span></NavLink>
                            <NavLink onClick={logout} exact to="/userlogin"> <span>Logout</span> </NavLink>
                       </div>

                   </div>

                  <div id={style.displayBox}>
                      {/* <Routes>
                           <Route exact path="/userdashboard" element={<UserSubject/>} ></Route>
                           <Route exact path="/userdashboard/Result" element={<UserResult/>} ></Route>

                           <Route exact path="/userdashboard/Exam/:category" element={<UserExam/>} ></Route>

                           <Route exact path="/userdashboard/Exam/:category/:id" element={<Test/>} ></Route>
                      </Routes> */}
                   </div>
            
              </>
          );
      }

      export default UserDashboard;