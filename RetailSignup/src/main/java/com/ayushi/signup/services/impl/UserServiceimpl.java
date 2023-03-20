package com.ayushi.signup.services.impl;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ayushi.signup.payloads.UserDto;
import com.ayushi.signup.repositories.UserRepo;
import com.ayushi.signup.services.UserService;
import com.ayushi.signup.entities.*;

@Service

public class UserServiceimpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;


	@Override
	public UserDto createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user = this.dtoToUser(userDto);
		User savedUser = this.userRepo.save(user);
		return this.userToDto(savedUser);
	}

	

	private User dtoToUser(UserDto userDto) {
//Using ModelMapper
		User user = this.modelMapper.map(userDto,  User.class);
		return user;
		
//Using Manually 
//		User user = new User();
//		user.setId(userDto.getId());
//		user.setUsername(userDto.getUsername());
//		user.setFirstName(userDto.getFirstName());
//		user.setLastName(userDto.getLastName());
//		user.setEmail(userDto.getEmail());
//		user.setPassword(userDto.getPassword());
//		return user;

	}

	public UserDto userToDto(User user) {
		UserDto userDto = this.modelMapper.map(user,  UserDto.class);
		return userDto;
//		UserDto userDto = new UserDto();
//		userDto.setId(user.getId());
//		userDto.setUsername(user.getUsername());
//		userDto.setFirstName(user.getFirstName());
//		userDto.setLastName(user.getLastName());
//		userDto.setEmail(user.getEmail());
//		userDto.setPassword(user.getPassword());
//		return userDto;

	}

}
