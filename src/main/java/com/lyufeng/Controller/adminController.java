package com.lyufeng.Controller;

import com.lyufeng.Service.AdminService;
import com.lyufeng.entity.Member;
import com.lyufeng.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class adminController {
	
	@Autowired
	AdminService adminService;
	
	//接受成员查询请求
	//请求方法：GET
	@GetMapping("/admin/members")
	public Result findAll(){
		log.info("接收到\"GET\"请求...");
		log.info("开始封装数据...");
		List<Member> members = adminService.findAll();
		log.info("数据封装完成...");
		log.info("开始返回数据...");
		return Result.success(members);
	}
	
	//接受成员新增请求
	//请求方法：POST
	@PostMapping("/admin/members")
	public Result add(@RequestBody Member member){
		log.info("接收到\"POST\"请求+++");
		log.info("开始发起新增+++");
		boolean flag = adminService.add(member);
		if (!flag){
			log.error("添加失败+++");
			return Result.error("添加失败");
		}
		log.info("添加成功+++");
		return Result.success();
	}
	
	//接受修改成员请求
	//请求方法：PUT
	public Result edit(@RequestBody Member member){
		log.info("接收到\"PUT\"请求???");
		log.info("开始发起修改???");
		boolean flag = adminService.edit(member);
		if (flag){
		
		}
		return Result.success();
	}
}
