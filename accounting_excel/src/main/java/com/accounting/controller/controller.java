package com.accounting.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.accounting.service.testService;

@Controller
public class controller {
	@Inject
	testService testService;
	
	@RequestMapping(value="/login")
	public String login(Model model,@RequestParam(value="error",required = false)String error) {
		if (error != null) {
			model.addAttribute("error", "아이디, 비밀번호를 확인하세요.");
		}
		
		return "login";
	}
	
}
