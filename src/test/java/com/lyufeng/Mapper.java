package com.lyufeng;

import com.lyufeng.entity.Member;
import org.apache.ibatis.annotations.Update;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {
	@Update("UPDATE member SET name = #{name}, gender = #{gender}, dept = #{dept}, office = #{office}, email = #{email}, phone = #{phone}, hobby = #{hobby}, status = #{status} WHERE id = #{id}")
	public Integer edit(Member member);
	
	@Update("UPDATE member SET id = #{newId} WHERE id = #{id}")
	public void upId(Integer id, Integer newId);
}
