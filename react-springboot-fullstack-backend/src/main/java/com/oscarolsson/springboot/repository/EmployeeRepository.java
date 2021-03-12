package com.oscarolsson.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oscarolsson.springboot.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{ // give us CRUD operations for Employee entity

}
