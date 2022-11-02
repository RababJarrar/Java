package com.axsos.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@SpringBootApplication	
@Controller
public class omikujiformcontrollers {

	@RequestMapping("/omikuji")
	public String index() {
		return "index.jsp";
	}
	@PostMapping("/send")
	public String sendform(@RequestParam(value="number") Integer num,@RequestParam(value="city") String c,
			@RequestParam(value="name") String n,@RequestParam(value="hoppy") String h,@RequestParam(value="living") String l,
			@RequestParam(value="something") String sth,HttpSession session){
		session.setAttribute("NUM", num);	
		session.setAttribute("CITY", c);	
		session.setAttribute("NAME", n);
		session.setAttribute("HOPPY", h);	
		session.setAttribute("LIVING", l);	
		session.setAttribute("STH", sth);	
		return "redirect:/omikuji/show";
		
	}
	@RequestMapping("/omikuji/show")
	public String show() {
	
		return "show.jsp";
	}
	
}
