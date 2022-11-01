package com.axsos.counter.controller;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CounteController {
	@RequestMapping("/")
	public String index(HttpSession session) {        
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			} 
		else {
				Integer currentCount = (Integer)session.getAttribute("count");
				currentCount = currentCount+1 ;
				session.setAttribute("count",currentCount);
		}
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String showCount( Model model) {
		return "page2.jsp";
	}

}
