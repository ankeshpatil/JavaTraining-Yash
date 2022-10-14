import React from "react"
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";
import style from "./UserLogin.module.css"
import { NavLink } from "react-router-dom";

 const UserLogin=()=>{
 
    const [user , setUser] = useState({
        email:"",
        password:""
    });

    function onTextFieldChange(e){
        setUser({
            ...user ,
            [e.target.name] : e.target.value
        });
    }


    const navigate = useNavigate();


  const handleLogin=async()=>
   {
      let value  = await axios.get(`http://localhost:8082/user/${user.email}`);

      //console.log(value.data.email);
      //console.log(user.email);

      //console.log(value.data.password);
      //console.log(user.password);

            if( value.data.email === user.email &&
               value.data.password === user.password)
            {
               alert("success");
               sessionStorage.setItem("user" , user.email);
              navigate("/userdashboard");
            }
            else alert(" Wrong User Email or password");
         
    }
    

     return(
        <div id={style.container}>

            <div id={style.containerHeadingBox}>
                <h1>User Login</h1>
            </div>

           <div id={style.emailBox}>
               <label htmlFor="email"> Email
                   <input name="email" 
                   onChange={(e) => onTextFieldChange(e)} type="text" id={style.email} />
               </label>
           </div>


           <div id={style.passwordBox}>
               <label htmlFor="password"> Password
                 <input name="password" 
                  onChange={(e) => onTextFieldChange(e)} type="password" id={style.password} />
               </label>
           </div>


           <button id={style.login} onClick={handleLogin}>Login</button>


          <div id={style.signup}>
             New to Portal?  <NavLink exact to="/Usersignup"> Register</NavLink> 
             <NavLink id={style.goBackLink} exact to="/"> Go Back</NavLink> 
          </div>


           </div>
     ); 
 }

 export default UserLogin