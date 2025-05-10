package com.lyufeng;

import com.lyufeng.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClimbersBackDataApplicationTests {
	
	@Autowired
	Mapper mapper;
	
	@Test
	void contextLoads() {
		Member member = new Member();
		
		member.setName("");
		member.setGender("");
		member.setDept("");
		member.setOffice("");
		member.setEmail("");
		member.setPhone("");
		member.setHobby("");
		member.setStatus(true);
		
		
		//mapper.upId(16,15);
	}
	
}
