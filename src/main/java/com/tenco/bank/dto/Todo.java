package com.tenco.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {

	// { "userId": 1, "id": 10, "title": "illo est ratione doloremque quia maiores aut", "completed": true }
	private Integer userId;
	private Integer id;
	private String title;
	private boolean completed;
	
	
}
