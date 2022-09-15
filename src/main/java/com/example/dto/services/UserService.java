package com.example.dto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dto.dto.UserDto;
import com.example.dto.model.User;
import com.example.dto.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true) // Para deixar a leitura mais rápida (não usar readOnly = true P/ outros métodos)
	public UserDto findById(Long id) {
		User entity = repository.findById(id).get(); //vai ao banco
		UserDto dto = new UserDto(entity); //retorna transformado no obj dto 
		return dto;
	}
	
}
