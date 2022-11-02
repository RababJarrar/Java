package com.axsos.ninjagold.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NinjaController {
	@RequestMapping("/")
    public String index(HttpSession session) { 

		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
			ArrayList<String> comment = new ArrayList<String>();
			session.setAttribute("comm", comment);
		}

        return "Gold.jsp"; 
	}
	
	@RequestMapping("/farm")
    public String farm(HttpSession session) {   
		int min = 10;
	    int max = 20;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		Integer c = (Integer) session.getAttribute("gold");
		session.setAttribute("gold", random_int+c);	
		ArrayList<String> m =(ArrayList<String>) session.getAttribute("comm");
		m.add("You entered a farm and earned "+random_int+" gold");
        return "redirect:/";
	}
	@RequestMapping("/cave")
    public String cave(HttpSession session) {   
		int min = 5;
	    int max = 10;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		Integer c = (Integer) session.getAttribute("gold");
		session.setAttribute("gold", random_int+c);	
		ArrayList<String> m =(ArrayList<String>) session.getAttribute("comm");
		m.add("You entered a cave and earned "+random_int+" gold");
        return "redirect:/";
	}
	@RequestMapping("/house")
    public String house(HttpSession session) {   
		int min = 2;
	    int max = 5;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		Integer c = (Integer) session.getAttribute("gold");
		session.setAttribute("gold", random_int+c);	
		ArrayList<String> m =(ArrayList<String>) session.getAttribute("comm");
		m.add("You entered a house and earned "+random_int+" gold");
        return "redirect:/";
	}
	@RequestMapping("/quest")
    public String quest(HttpSession session) {   
		int min = -50;
	    int max = 50;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		Integer c = (Integer) session.getAttribute("gold");
		session.setAttribute("gold", random_int+c);	
		ArrayList<String> m =(ArrayList<String>) session.getAttribute("comm");
		if (random_int >0) {
			m.add("You entered a quest and earned "+random_int+" gold");
		}
		else {
			m.add("You entered a quest and lost "+(-1)*random_int+" gold");
		}
		
        return "redirect:/";
	}

	

}
