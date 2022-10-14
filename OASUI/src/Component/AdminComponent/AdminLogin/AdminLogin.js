import React from "react"
import { Link } from "react-router-dom";
import { useState } from "react";
import axios from "axios";
import { useNavigate } from 'react-router-dom';

import style from "./AdminLogin.module.css";

const AdminLogin=()=>{
    
    const[admin , setAdmin] = useState({
        admin_name:"",
        admin_password:""
    },[]);
    function handleInput(e){
        setAdmin({
            ...admin,
            [e.target.name] : e.target.value
        },[]);
  }
  const navigate = useNavigate();

  const login=async(e)=>{
    const value = await axios.get(`http://localhost:8082/admin/${admin.admin_name}`); 
   
             //console.log(admin.admin_name);
           console.log(value.data);

    if(value.data.name === admin.admin_name)
             {
                if(value.data.password === admin.admin_password){
                    alert("success");
                    navigate("/AdminDashboard");
                }
                else{
                    alert("Wrong Password");
                }
             }
             else{
                 alert("Wrong Admin name");
             }
         }
  
  

         return (
          <div id={style.container}>

          
          <div id={style.containerHeadingBox}>
              <h1>Admin Login</h1>
          </div>


          <div id={style.emailBox}>
              <label htmlFor="email"> Email
                  <input name="admin_name" onChange={(e) => handleInput(e)} type="text" id={style.email} />
              </label>
          </div>


          <div id={style.passwordBox}>
              <label htmlFor="password"> Password
                  <input name="admin_password" onChange={(e) => handleInput(e)} type="password" id={style.password} />
              </label>
          </div>

          <button onClick={(e) => login(e)}    id={style.login}>Login</button>
           

          <Link to="/" id={style.goBackLink}> Go Back</Link> 


          </div>
       );
   }


export default AdminLogin;