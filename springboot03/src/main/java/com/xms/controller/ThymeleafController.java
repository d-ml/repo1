package com.xms.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xms.entity.User;

@Controller
@RequestMapping("/th")
public class ThymeleafController {
	
	@RequestMapping("/index")
	public String index() {
		return "thymeleaf/index";
	}
	
	@RequestMapping("/center")
	public String center(Model model) {
		model.addAttribute("name","张三");
		return "thymeleaf/center";
	}
	
	@RequestMapping("/test")
	public String test(Model model) {
		User one =new User();
		one.setId(1001);
		one.setName("张三丰");
		one.setPassword("1234");
		one.setAge(24);
		one.setBirthday(new Date());
		one.setDescription("我是张三丰");
		
		model.addAttribute("user", one);
		
		return "thymeleaf/test";
	}
	
	@PostMapping("/post")
	public String post(User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		
		return "redirect:/th/test";
	}
	
	
	
	
}
