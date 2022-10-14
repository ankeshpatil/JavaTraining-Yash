import { useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";
import style from "./UserSignup.module.css";
import { Link } from "react-router-dom";

const UserSignup=()=> {

    const [userData , setUserData] = useState({
       name: "",
       email: "",
       password: ""
    });

    function onTextFieldChange(e){
        setUserData({
            ...userData,
            [e.target.name] : e.target.value
        });
    }


     const [password , setPassword] = useState("");

     function handlePassword(e){
       setPassword(e.target.value);
   }
   

   const navigate = useNavigate();
   
   const handleSignup=async()=>{
       // console.log(userData);
       // console.log(password);
       const value = await axios.get(`http://localhost:8082/user`);
       if(userData.email !== value.data.email){

        if(userData.password === password)
        {
            await axios.post(`http://localhost:8082/user` , userData);
            alert("Your account has created");
            alert("Please Login");
            navigate("/userlogin");
        }
        else alert("password did not match");
    }
    else alert("Email id already exist");
       }
      



   return (
       <div id={style.container}>

           <div id={style.formHeading}>
               <h1>User Signup</h1>
               <p>Please complete the form below to register with us</p>
           </div>

           <div id={style.nameBox}>
               <label htmlFor="name">Name 
                   <input onChange={(e) => onTextFieldChange(e)} 
                   type="text" name="name"  required />
               </label>
           </div>


           <div id={style.emailBox}>
               <label htmlFor="email"> Email
                   <input onChange={(e) => onTextFieldChange(e)}  
                   type="text" name="email" required />
               </label>
           </div>

           <div id={style.passwordBox}>
               <label htmlFor="password"> Password
                   <input onChange={(e) => onTextFieldChange(e)} 
                   type="password" name="password" required />
               </label>
           </div>


           <div id={style.confirmPasswordBox}>
               <label htmlFor="confirmPassword">Confirm Password
                   <input  onChange={(e) => handlePassword(e)}
                    type="password" name="confirmPassword" required />
               </label>
           </div>


           {/* <button id={style.signup} onclick="signup()">Sign Up</button> */}
           <button id={style.signup} onClick={handleSignup} >Sign Up</button>


           <div id={style.login}>
               Have a Account?  <Link exact to="/userlogin"> Log in</Link>
           </div>


       </div>
   );
}

export default UserSignup;