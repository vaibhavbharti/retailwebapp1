package com.ayushi.signup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayushi.signup.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
