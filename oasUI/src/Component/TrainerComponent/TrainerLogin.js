import React from "react"
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";

import { NavLink } from "react-router-dom";
import { Link } from "react-router-dom";

 const TrainerLogin=()=>{
 
    const [user , setUser] = useState({
        name:"",
        password:""
    });

    function onTextFieldChange(e){
        setUser({
            ...user ,
            [e.target.name] : e.target.value
        });
    }


    const navigate = useNavigate();


  const onSubmit=async(e)=>
   {
    e.preventDefault();
    
      let value  = await axios.get(`http://localhost:8082/trainer/${user.name}`);
      
    console.log("hello")

       console.log(value.data.name);
       console.log(user.name);

    //   console.log(value.data.password);
    //   console.log(user.password);

            if( value.data.name === user.name &&
               value.data.password === user.password)
            {
               alert("success");
               sessionStorage.setItem("user" , user.name);
              navigate("/AdminDashboard");
            }
            else alert(" Wrong User Email or password");
         
    }
    

     return(
      
        <div className="container">
      <div className="row">
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
          <h2 className="text-center m-4 text-primary">Login Trainer</h2>

          <form  onSubmit={(e) => onSubmit(e)}>
            <div className="mb-3">
              <label htmlFor="email" className="form-label text-primary">
                Email Address
              </label>
              <input
                type={"text"}
                className="form-control"
                placeholder="Enter your emailid"
                name="email"
                onChange={(e) =>onTextFieldChange(e)} /> 
            </div>

            <div className="mb-3" >
              <label htmlFor="password" className="form-label text-primary">
                Password
              </label>

              <input
                type={"password"}
                className="form-control"
                placeholder="Enter your password"
                name="password"
                
                onChange={(e) =>  onTextFieldChange(e)}
              /> 
            </div>

            <button type="submit" className="btn btn-success">
              Login
            </button>
            
            
            <NavLink className="btn btn-outline-danger mx-2" exact to="/"> Go Back</NavLink> 
          </form>
        </div>
      </div>
    </div>


     ); 
 }

 export default TrainerLogin