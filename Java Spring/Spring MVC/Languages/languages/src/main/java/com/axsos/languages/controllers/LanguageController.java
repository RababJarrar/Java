package com.axsos.languages.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.axsos.languages.models.Language;
import com.axsos.languages.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService langServ;
	public LanguageController(LanguageService langServ) {
		this.langServ = langServ;
	}

	@GetMapping("/languages")
	public String index(@ModelAttribute("language") Language language,Model model) {
		model.addAttribute("languages",langServ.all_lang());
		return "index.jsp";
	}
	
	
	 @PostMapping("/createlang")
	 public String creat(@Valid @ModelAttribute("language") Language language, BindingResult result,Model model) {
		 model.addAttribute("languages",langServ.all_lang());  //we add Model model to show inform on .jsp 
		 if (result.hasErrors()) {
	            return "index.jsp";
	        } else {
	        	langServ.create_lang(language);
	            return "redirect:/languages";
	        }
	 }

//	 @ModelAttribute("this_language") Language language, 
	    @GetMapping("/languages/edit/{id}")
	    public String index2(@PathVariable("id") Long id, Model model) {
	        model.addAttribute("language", langServ.find_lang(id));
	        return "edit.jsp";
	    } 
	    @PutMapping("/languages/{id}")
	    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
	        if (result.hasErrors()) {
	            return "edit.jsp";
	        } else {
	        	langServ.update_lange(language);
	            return "redirect:/languages";
	        }
	    }
	    
	    @GetMapping("/languages/delete/{id}")
        public String destroy(@PathVariable("id") Long id,@ModelAttribute("language") Language language) {
	    	langServ.delete_lang(id);
            return "redirect:/languages";
        }
	    @GetMapping("/languages/{id}")
		public String index3(@PathVariable("id") Long id,@ModelAttribute("language") Language language,Model model) {
			model.addAttribute("language",langServ.find_lang(id));
			return "show.jsp";
		}
}
