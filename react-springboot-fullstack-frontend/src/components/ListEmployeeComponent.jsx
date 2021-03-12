import React, { useState, useEffect } from 'react';

const ListEmployeeComponent = () => {
    const [employees, setEmployees] = useState([]);
    
    useEffect({
        
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
                            const {firstName, lastName, email, id} = employees;
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