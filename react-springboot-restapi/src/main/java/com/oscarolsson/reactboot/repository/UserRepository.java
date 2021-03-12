package com.oscarolsson.reactboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oscarolsson.reactboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{ //get CRUD operations on user entity

}
