import React from "react";

import style from "../../SubjectComponent/Subject.module.css";

import { useState } from "react";

import { useNavigate, useParams } from "react-router-dom";
import axios from "axios";

const AddQuestion = () => {
  const { id } = useParams();

  const [question, setQuestion] = useState({
    qname: "",
    optionOne: "",
    optionTwo: "",
    optionThree: "",
    optionFour: "",
    answer: "",
    ename: id,
    sname: "",
  });

  function onInputChange(e) {
    setQuestion({
      ...question,
      [e.target.name]: e.target.value,
    });

     console.log(question);
  }

  const navigate = useNavigate();

 const handleGoBack=()=> {
    navigate(`/AdminDashboard/Exam`);
  }

  const addnewQuestion = async () => {
    setQuestion((question.ename = { id: id }));

    setQuestion(
      (question.sname = { name: document.getElementById("subjectField").value })
    );

    await axios.post(`http://localhost:8082/question`, question);
     navigate(`/AdminDashboard/Exam/ViewQuestion/${id}`);
  };

  return (
    <>
      <div id={style.displayHeadingBox}>
        <h2>Adding Question</h2>
      </div>

      <div id={style.addBox} className={style.addQuestion}>
        <label>Question Name </label>
        <input
          onChange={(e) => onInputChange(e)}
          name="qname"
          type="text"
          placeholder="Enter Question"
        />

        <label>Enter Option A </label>
        <input
          onChange={(e) => onInputChange(e)}
          name="optionOne"
          type="text"
          placeholder="Enter Option A"
        />

        <label>Enter Option B</label>
        <input
          onChange={(e) => onInputChange(e)}
          name="optionTwo"
          type="text"
          placeholder="Enter Option B"
        />

        <label>Enter Option C</label>
        <input
          onChange={(e) => onInputChange(e)}
          name="optionThree"
          type="text"
          placeholder="Enter Option C"
        />

        <label>Enter Option D</label>
        <input
          onChange={(e) => onInputChange(e)}
          name="optionFour"
          type="text"
          placeholder="Enter Option D"
        />

        <label>Enter Question Answer</label>
        <input
          onChange={(e) => onInputChange(e)}
          name="answer"
          type="text"
          placeholder="Enter Question answer (don't write option A,B,C,D)"
        />

        <label>Enter Subject</label>
        <input
          onChange={(e) => onInputChange(e)}
          name="sname"
          id="subjectField"
          type="text"
          placeholder="Enter Subject"
        />

        <div id={style.buttonBox}>
           <button onClick={addnewQuestion}>Add</button>
          <button onClick={handleGoBack}>Go back</button> 
         
        </div>
      </div>
    </>
  );
};

export default AddQuestion