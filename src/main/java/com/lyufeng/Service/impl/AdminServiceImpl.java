package com.lyufeng.Service.impl;

import com.lyufeng.Service.AdminService;
import com.lyufeng.entity.Member;
import com.lyufeng.Mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;
	
	//增
	@Override
	public boolean add(Member member) {
		return adminMapper.add(member) != 0;
	}
	
	//改
	public boolean edit(Member member) {
		return adminMapper.edit(member) != 0;
	}
	
	//查
	@Override
	public List<Member> findAll() {
		return adminMapper.findAll();
	}
}
