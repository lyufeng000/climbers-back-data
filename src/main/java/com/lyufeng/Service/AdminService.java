package com.lyufeng.Service;


import com.lyufeng.entity.Member;

import java.util.List;

public interface AdminService {
	//增
	public boolean add(Member member);
	
	//删
	public boolean delete(Integer id);
	
	//改
	public boolean edit(Member member);
	
	//查
	public List<Member> findAll();
	
	
}
