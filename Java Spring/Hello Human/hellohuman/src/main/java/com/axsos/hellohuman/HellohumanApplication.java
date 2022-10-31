package com.axsos.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}

	@RequestMapping("/")
	public String index(@RequestParam(value ="q",required=false) String name) {
		if (name == null) {
			return "Hello Human";
		}
		else {
		return "Hello "+ name ;
		}
	}
}
