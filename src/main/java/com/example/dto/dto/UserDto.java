package com.example.dto.dto;

import com.example.dto.model.User;

public class UserDto {

		private Long id;
		private String nome;
		
		public UserDto() {}

		public UserDto(Long id, String nome) {
			this.id = id;
			this.nome = nome;
		}
		
		//construtor para facilitar a coniversao de Entidades para DTO
		public UserDto(User user) { 
			id = user.getId();
			nome = user.getNome();
		}

		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
}
