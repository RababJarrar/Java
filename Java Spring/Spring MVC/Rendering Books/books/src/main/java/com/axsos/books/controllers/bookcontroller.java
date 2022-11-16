package com.axsos.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.axsos.books.models.Book;
import com.axsos.books.services.BookService;

@Controller
public class bookcontroller {
	@Autowired
	BookService bookservice;
	
	@GetMapping("/books/{bookId}")
	public String index(Model model, @PathVariable(value="bookId")Long bookId) {
		Book book =bookservice.findBook(bookId);
		model.addAttribute("book", book);
		return "index.jsp";
		
	}

}