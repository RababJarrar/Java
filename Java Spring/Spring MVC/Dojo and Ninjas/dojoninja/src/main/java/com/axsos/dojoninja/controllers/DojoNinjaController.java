package com.axsos.dojoninja.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsos.dojoninja.models.Dojo;
import com.axsos.dojoninja.models.Ninja;
import com.axsos.dojoninja.services.DojoService;
import com.axsos.dojoninja.services.NinjaService;

@Controller
public class DojoNinjaController {
	private final DojoService dojoService;
	private final NinjaService ninjaService;
	public DojoNinjaController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	
	@GetMapping("/dojos/new")
	public String index(@ModelAttribute("dojo") Dojo dojo) {
		return "dojo.jsp";
	}

	@GetMapping("/ninjas/new")
	public String index2(@ModelAttribute("ninja") Ninja ninja,Model model) {
		model.addAttribute("dojos",dojoService.allDojo());
		return "ninja.jsp";
	}
  
	 @PostMapping("/createdojo")
	 public String index3(@ModelAttribute("dojo")Dojo dojo, BindingResult result) {
		 dojoService.createDojo(dojo);
	            return "redirect:/dojos/new";     
	 }

	 @PostMapping("/createninja")
	 public String index4(@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result) {
		 if (result.hasErrors()) {
	            return "ninja.jsp";
	     } 
		 else {
	        		ninjaService.createNinja(ninja);
	            return "redirect:/ninjas/new"; 
	     }    
	 }	 
	
	
	
}



