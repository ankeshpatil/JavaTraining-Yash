import React from "react";

import style from "./Home.module.css";
import pic1 from "../../images/1.png";
import { Link } from "react-router-dom";

import { Navbar, Container } from "react-bootstrap";



const Home = () => {
  return (
    <>
      {/* <div id={style.header}>
                     <div id={style.headerHeadingBox}>
                          <h3>Online Assessment System</h3> 
                          
                      </div>
                  </div> */}
      <Navbar bg="danger" variant="dark">
        <Container>
          <Navbar.Brand href="#home">Online Assessment System</Navbar.Brand>
          <ul className="nav navbar-nav navbar-right">

          <li><Link to="/UserLogin"><button type="button" class="btn btn-outline-dark me-1 ">USER</button></Link></li>
          <li><Link to="/AdminLogin"><button type="button" class="btn btn-outline-dark me-1">ADMIN</button></Link></li>
          <li><Link to="/TrainerLogin"><button type="button" class="btn btn-outline-dark ">TRAINER</button></Link></li>

</ul>
        </Container>

      </Navbar>

      <div id={style.div1}>
         <img src={pic1} alt="" /> 
        {/* <h1 class="display-1 text-danger">Online Assessment System</h1> */}
        <h1 className="text-danger font-weight-bold">Online Assessment System</h1>
      </div>

      {/* <div id={style.div2}>
        <div className={style.div3}>
           <Link  to="/UserLogin" >
                          <img src={pic2} alt="" /> 
                         <span>User</span> 
                       </Link> 
          
        </div>

        <div className={style.div3}>
           <Link to="/AdminLogin">
            <img src={pic3} alt="" /> 
            <span>Admin</span>
          </Link> 
          
        </div>
        <div className={style.div3}>
           <Link className="btn btn-primary mx-2" to="UserLogin">
            TRAINER
          </Link> 
          </div>
      </div> */}
    </>
  );
};

export default Home;
