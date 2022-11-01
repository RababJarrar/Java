package com.axsos.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class DisplaydateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplaydateApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		String timePattern = "hh:mm a";
		SimpleDateFormat timeFormat = new SimpleDateFormat(timePattern);
		String date = timeFormat.format(new Date());	
		model.addAttribute("date", date);
		return "time.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		String datePattern = "EEEEE, dd MMMMM, yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
		String date = dateFormat.format(new Date());	
		model.addAttribute("date", date);
		return "date.jsp";
	}

	
	

}
