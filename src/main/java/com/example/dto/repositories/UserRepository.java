package com.example.dto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dto.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
