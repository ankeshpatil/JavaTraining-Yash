
import './App.css';

import 'bootstrap/dist/css/bootstrap.min.css';
import {BrowserRouter as Router,Routes,Route} from 'react-router-dom'
import Home from './Component/HomeComponent/Home';
import TrainerLogin from './Component/TrainerComponent/TrainerLogin';
import UserLogin from './Component/UserComponent/UserLogin/UserLogin';
import AdminLogin from './Component/AdminComponent/AdminLogin/AdminLogin';
import AdminDashboard from './Component/AdminComponent/AdminDashboard/AdminDashboard';
import UserSignup from './Component/UserComponent/UserSignup/UserSignup';
import UserDashboard from './Component/UserComponent/UserDashboard/UserDashboard';
import Subject from './Component/AdminComponent/AdminDashboard/SubjectComponent/Subject';
import Exam from './Component/AdminComponent/AdminDashboard/ExamComponent/Exam';
import ViewQuestion from './Component/AdminComponent/AdminDashboard/ExamComponent/ViewQuestion/ViewQuestion';
import Details from './Component/AdminComponent/AdminDashboard/ExamComponent/DetailComponent/Details';
import Dashboard from './Component/AdminComponent/AdminDashboard/Dashboard/Dashboard';
import Question from './Component/AdminComponent/AdminDashboard/QuestionComponent/Question';
import UserList from './Component/AdminComponent/AdminDashboard/UserList/UserList';
import Result from './Component/AdminComponent/AdminDashboard/ResultComponent/Result';
import AddQuestion from './Component/AdminComponent/AdminDashboard/ExamComponent/AddQuestion/AddQuestion';
import UserResult from './Component/UserComponent/UserDashboard/ResultComponent/UserResult';
import UserExam from './Component/UserComponent/UserDashboard/ExamComponent/UserExam';
import UserSubject from './Component/UserComponent/UserDashboard/SubjectComponent/UserSubject';
import Test from './Component/UserComponent/UserDashboard/TestComponent/Test';
import Footer from './Component/HomeComponent/Footer';


function App() {
  return (
    <div className="App">
   
       <Router>
       <Footer/>
      <Routes>   

      <Route exact path="/" element={<Home/>}/>
      <Route path="/AdminLogin" element={<AdminLogin/>}/>
      <Route path="/UserLogin" element={<UserLogin/>}/>
      <Route path="/UserSignup" element={<UserSignup/>}/>
      <Route path="/TrainerLogin" element={<TrainerLogin/>}/>
      <Route path="/AdminDashboard" element={<AdminDashboard/>}/>
      <Route path="/UserDashboard" element={<UserDashboard/>}/>


      <Route  path="/AdminDashboard/Subject" element={<Subject/>}/> 
      <Route  path="/AdminDashboard/Exam" element={<Exam/>}/>
      <Route  path="/AdminDashboard/Exam/Details/:id" element={<Details/>}/>
      <Route  path="/AdminDashboard/Exam/ViewQuestion/:id"element={<ViewQuestion/>}/>
      <Route  path="/AdminDashboard/Exam/AddQuestion/:id" element={<AddQuestion/>}/>
      <Route path="/AdminDashboard/Dashboard" element={<Dashboard/>}/>
      <Route  path="/AdminDashboard/Question" element={<Question/>}/>
      <Route  path="/AdminDashboard/Result" element={<Result/>}/>
      <Route  path="/AdminDashboard/UserList" element={<UserList/>}/>


      <Route exact path="/UserDashboard/UserSubject" element={<UserSubject/>} ></Route>
      <Route exact path="/UserDashboard/UserResult" element={<UserResult/>} ></Route>
      <Route exact path="/UserDashboard/Exam/:category" element={<UserExam/>} ></Route>
      <Route exact path="/UserDashboard/Exam/:category/:id" element={<Test/>} ></Route>
     
     

      </Routes>

     
      </Router>    
    </div>
  );
}

export default App;
