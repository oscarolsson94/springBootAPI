package com.oscarolsson.loginreg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oscarolsson.loginreg.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{ //class type of entity and primary key
	User findByEmail(String email);
}
