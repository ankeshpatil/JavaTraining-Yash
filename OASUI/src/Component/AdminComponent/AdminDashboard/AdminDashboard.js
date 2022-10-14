import { useNavigate } from "react-router-dom"
import {Route,Routes,Link } from "react-router-dom";
import style from "./AdminDashboard.module.css"
import Dashboard from "./Dashboard/Dashboard";
import Subject from "./SubjectComponent/Subject";
import Exam from "./ExamComponent/Exam";
import Question from "./QuestionComponent/Question";
import Result from "./ResultComponent/Result";
import UserList from "./UserList/UserList";
import User from "./UserList/User/User";
import Details from "./ExamComponent/DetailComponent/Details";
import ViewQuestion from "./ExamComponent/ViewQuestion/ViewQuestion";
import AddQuestion from "./ExamComponent/AddQuestion/AddQuestion";
import pic4 from "../../../images/logo.png";
import { Button } from "react-bootstrap";


const AdminDashboard=()=>{

    const navigate=useNavigate();

    const goToAdminLogin=()=>{
        
        navigate("/AdminLogin");
   }
    return(
        <>
       
                 <div id={style.header}>
                
            <div id={style.headerHeadingBox}>
                <h3>Online Assessment System</h3> 
            </div>

             <div id={style.headerMenuBox}>
                <Link to="/AdminDashboard/Dashboard"> <Button variant="light" > Dashboard</Button></Link>
                
                 <Button variant="danger"  onClick={goToAdminLogin} ><span > Logout</span></Button>
             </div>
        </div>

                <div id={style.content}>

                <div id={style.sideMenubar}>
                         <div id={style.sideMenubarImageBox}>
                           <img src= {pic4} alt="" />
                         </div>

                         <div id={style.sideMenubarList}>
                            <Link  className={style.removeUnderline} to="/AdminDashboard/Subject"> <button > <span>  Subject </span></button></Link>
                            <Link  className={style.removeUnderline} to="/AdminDashboard/Exam"> <button > <span>  Exam </span></button></Link>
                            <Link  className={style.removeUnderline} to="/AdminDashboard/Question"> <button > <span>  Question </span></button></Link>
                            <Link  className={style.removeUnderline} to="/AdminDashboard/Result"> <button > <span>  Result </span></button></Link>
                            <Link  className={style.removeUnderline} to="/AdminDashboard/UserList"> <button > <span>  UserList </span></button></Link>
                        </div>
                    </div>

                    
                    <div id={style.display}>
                      
              {/* <Routes>
                  <Route path="/AdminDashboard/Dashboard" element={<Dashboard/>}/>

                  <Route  path="/AdminDashboard/Subject" element={<Subject/>}/> 
                  <Route  path="/AdminDashboard/Question" element={<Question/>}/>
                  <Route  path="/AdminDashboard/Result" element={<Result/>}/>
                  <Route  path="/AdminDashboard/UserList" element={<UserList/>}/>

                      <Route  path="/AdminDashboard/Exam/Details/:id" element={<Details/>}/>
                      <Route  path="/AdminDashboard/Exam/ViewQuestion/:id"element={<ViewQuestion/>}/>
                      <Route  path="/AdminDashboard/Exam" element={<Exam/>}/>
                      
                      <Route  path="/AdminDashboard/Exam/AddQuestion/:id" element={<AddQuestion/>}/>

                      <Route exact path="/AdminDashboard/UserList/Details/:id" element={<User/>}/>


              </Routes>  */}
                      
                    </div> 

                </div>
                
            </>
    )
}
export default AdminDashboard