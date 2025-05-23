package com.lyufeng.Mapper;

import com.lyufeng.entity.Member;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AdminMapper {
	//增
	@Insert("INSERT INTO member (name, gender, dept, office, email, phone, hobby, status) VALUES (#{name}, #{gender}, #{dept}, #{office}, #{email}, #{phone}, #{hobby}, #{status})")
	public Integer add(Member member);
	
	//删
	@Delete("DELETE FROM member WHERE id = #{id}")
	public int delete(Integer id);
	
	//改
	@Update("UPDATE member SET name = #{name}, gender = #{gender}, dept = #{dept}, office = #{office}, email = #{email}, phone = #{phone}, hobby = #{hobby}, status = #{status} WHERE id = #{id}")
	public Integer edit(Member member);
	
	//查
	@Select("SELECT * FROM member")
	public List<Member> findAll();
	
	
}
