import React, { useState, useEffect } from 'react';
import axios from 'axios';

const ListEmployeeComponent = () => {

    const EMPLOYEE_API_URL = "http://localhost:8080/api/v1/employees";

    const [employees, setEmployees] = useState([]);
    
    const getEmployees = () => {
        return axios.get(EMPLOYEE_API_URL);
    }

    useEffect(()=>{
        const data = getEmployees();
        
        setEmployees(data);
    },[])

    

    return (
        <div>
            <h2 className="text-center">Employees List</h2>
            <div className="row">
                <table className = "table table-striped table-bordered">
                    <thead>
                        <tr>
                            <th>Employee First Name</th>
                            <th>Employee Last Name</th>
                            <th>Employee Email</th>
                            <th>Actions</th>
                        </tr>
                    </thead>

                    <tbody>
                        {employees.map((employee) => {
                            const {firstName, lastName, email, id} = employee;
                            return (
                                <tr key={id}>
                                    <td>{ firstName }</td>
                                    <td>{ lastName }</td>
                                    <td>{ email }</td>
                                    <td></td>
                                </tr>
                            );
                        })}
                    </tbody>
                </table>
            </div>
        </div>
      
  );




};

export default ListEmployeeComponent;