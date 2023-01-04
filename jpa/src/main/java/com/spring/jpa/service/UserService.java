package com.spring.jpa.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.jpa.entity.User;
import com.spring.jpa.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void saveUser(User user) {
		 userRepository.save(user);
		
	}

	public List<User> getAll() {
		
		return(List<User>) userRepository.findAll();
	}

	public Optional<User> getByID(UUID id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	public void DeleteUser(UUID id) {
		
		userRepository.deleteById(id);
	}

	public void updateUser(User user) {
		 userRepository.save(user);
		
	}

	

	}


