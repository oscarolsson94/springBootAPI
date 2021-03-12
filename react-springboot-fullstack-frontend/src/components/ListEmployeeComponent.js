import React, { useState, useEffect } from 'react';

const ListEmployeeComponent = (props) => {

    const EMPLOYEE_API_URL = "http://localhost:8080/api/v1/employees";

    const [employees, setEmployees] = useState([]);
    const [loading, setLoading] = useState(true);
    
    const getEmployees = async () => {
        const response = await fetch(EMPLOYEE_API_URL);
        const data = await response.json()
        setEmployees(data);
        setLoading(false);
    }

    const addEmployee = () =>{
        props.history.push("add-employee");
    }

    useEffect(()=>{
        getEmployees();
      },[])

    return (
        <div>
            <h2 className="text-center">Employees List</h2>
            <div className="row">
                <button className="btn btn-primary" onClick={addEmployee}>Add Employee</button>
            </div>
            <div className="row">
                {loading ? <h1>Loading...</h1> :
                    <table className="table table-striped table-bordered">
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
                                const { firstName, lastName, email, id } = employee;
                                return (
                                    <tr key={id}>
                                        <td>{firstName}</td>
                                        <td>{lastName}</td>
                                        <td>{email}</td>
                                        <td></td>
                                    </tr>
                                );
                            })}
                        </tbody>
                    </table>
                }
            </div>
        </div>
      
  );




};

export default ListEmployeeComponent;