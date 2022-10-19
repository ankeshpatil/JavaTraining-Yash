import React from 'react'

import axios from "axios";

import { useEffect, useState } from "react";


import style from "../SubjectComponent/Subject.module.css"





const Result=()=> {

    const [results, setResults] = useState([]);

    useEffect(() => {

        async function getAllResults() {
            let value = await axios.get(`http://localhost:8082/result`);
            setResults(value.data);
            //console.log(value.data[0]);
        }
        getAllResults();
    }, []);

    return (
        <>
            <div id={style.displayHeadingBox}>
                <h2>Exam List</h2>
            </div>

            
                <table class="table">
                    <thead class="thead-dark">
                        <tr>
                        <th scope="col">index</th>
                            <th scope="col">User Email</th>
                            <th scope="col">Exam Name</th>
                            <th scope="col">Exam Date</th>
                            <th scope="col">Result Status</th>
                            <th scope="col">Your Score</th>
                            <th scope="col">Total Marks</th>
                            <th scope="col">Total Question</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            results.map((data, i) => {
                                return (
                                    <tr key={i}>
                                        <td>{i+1}</td>
                                        <td>{data.email.email}</td>
                                        <td>{data.sname.name}</td>
                                        <td>{data.edate}</td>
                                        <td>{data.status}</td>
                                        <td>{data.score}</td>
                                        <td>{data.totalMarks}</td>
                                        <td>{data.totalQuestion}</td>
                                    </tr>
                                );
                            })
                        }

                    </tbody>
                </table>
            
        </>
    );
}

export default Result;