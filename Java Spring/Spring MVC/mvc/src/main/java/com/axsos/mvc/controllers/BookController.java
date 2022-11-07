package com.axsos.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.axsos.mvc.models.Book;
import com.axsos.mvc.services.BookService;

@Controller
public class BookController {
private final BookService bookService;
public BookController(BookService bookService) {
	this.bookService=bookService;
}

@GetMapping("/books")
public String hello(Model model) {
	List<Book> books=bookService.allBooks();
	model.addAttribute("books",books);
	return "books.jsp";
}
}
