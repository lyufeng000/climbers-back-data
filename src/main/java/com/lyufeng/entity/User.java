package com.lyufeng.entity;

import lombok.Data;

@Data
public class User {
	private Integer id;
	private String name;
	private String username;
	private String password;
	private String role;
	private String rememberToken;
	
}
