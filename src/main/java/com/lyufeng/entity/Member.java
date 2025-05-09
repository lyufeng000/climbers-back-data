package com.lyufeng.entity;

import lombok.Data;

@Data
public class Member {
	private Integer id;
	private String name;
	private String gender;
	private String office;
	private String dept;
	private String phone;
	private String email;
	private String hobby;
	private Boolean status;
}
