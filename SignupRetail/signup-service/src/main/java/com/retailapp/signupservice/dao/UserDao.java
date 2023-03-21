package com.retailapp.signupservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.retailapp.signupservice.POJO.User;

//passing user to jpa and its primaryKEy type;
public interface UserDao extends JpaRepository<User, Integer> {

	User findByEmailId(@Param("email") String email);
}
