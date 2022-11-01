package com.axsos.fruityloops;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//@Controller
@SpringBootApplication
public class FruityloopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruityloopsApplication.class, args);
	}
//	@RequestMapping("/")
//	public String index(Model model) {
//	     ArrayList<Item> fruits = new ArrayList<Item>();
//	     fruits.add(new Item("Kiwi", 1.5));
//	     fruits.add(new Item("Mango", 2.0));
//	     fruits.add(new Item("Goji Berries", 4.0));
//	     fruits.add(new Item("Guava", .75));
//	     model.addAttribute("dispplay_fruits", fruits);
//		 return"index.js";
//	}

}

     

     

