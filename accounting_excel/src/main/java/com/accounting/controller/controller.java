package com.accounting.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.accounting.service.testService;

@Controller
public class controller {
	@Inject
	testService testService;
	
	@RequestMapping(value="/login", method={RequestMethod.GET,RequestMethod.POST})
	public String login(Model model,HttpSession session,
			@RequestParam(value="error",required = false)String error,
			@RequestParam(value="id", required =false)String id) {
		if (error != null) {
			model.addAttribute("error", "아이디, 비밀번호를 확인하세요.");
		}
		System.out.println("login "+id);
		session.setAttribute("id", id);
		
		return "login";
	}
	
	
}
