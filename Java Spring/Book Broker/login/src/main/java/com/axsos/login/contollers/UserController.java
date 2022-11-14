package com.axsos.login.contollers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.login.models.Book;
import com.axsos.login.models.LoginUser;
import com.axsos.login.models.User;
import com.axsos.login.services.BookService;
import com.axsos.login.services.UserService;

@Controller
public class UserController {
	
	@Autowired
    private UserService userServ;
	@Autowired
    private BookService bookService;
	
	@GetMapping("/")
	   public String index(Model model, HttpSession session) {
	   	
	   	if (session.getAttribute("userId")!= null){
	   		return "redirect:/bookmarket";
	   	}
	   	
	       model.addAttribute("newUser", new User());
	       model.addAttribute("newLogin", new LoginUser());
	       return "login.jsp";
	   }
	   
	   @PostMapping("/register")
	   public String register(@Valid @ModelAttribute("newUser") User newUser, 
	           BindingResult result, Model model, HttpSession session) {
	       
	   	User registeredUser = userServ.register(newUser, result);
	       
	       if(result.hasErrors()) {
	           
	           model.addAttribute("newLogin", new LoginUser());
	           return "login.jsp";
	       }
	       session.setAttribute("userId", registeredUser.getId());
	       return "redirect:/bookmarket";
	     
	   }
	   
	   @PostMapping("/login")
	   public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	           BindingResult result, Model model, HttpSession session) {
	       
	   	
	        User user = userServ.login(newLogin, result);
	   
	       if(result.hasErrors()) {
	           model.addAttribute("newUser", new User());
	           return "login.jsp";
	       }
	       
	       session.setAttribute("userId", user.getId());
	       return "redirect:/bookmarket";
	   }
	   
	   @GetMapping ("/books")
	   public String home(Model model, HttpSession session){
	   	if (session.getAttribute("userId")!= null){
	   		Long userId = (Long) session.getAttribute("userId");
	   		User currentUser = userServ.findUserById(userId);
	   		model.addAttribute("currentUser", currentUser);	
	   		model.addAttribute("books",bookService.allbooks() );
	   		return "all.jsp";
	   	}
	   	return "redirect:/";
	   	  		
	   }
	   
	   @GetMapping ("/logout")
	   public String logout(HttpSession session){
	   	session.invalidate();
	   	return "redirect:/";		
	   }
	   
	   @GetMapping("/book/new")
	   public String index2(@ModelAttribute("book") Book book, Model model, HttpSession session) {
		   if (session.getAttribute("userId")!= null){
		   		Long userId = (Long) session.getAttribute("userId");
		   		User currentUser = userServ.findUserById(userId);
		   		model.addAttribute("currentUser", currentUser);
		   		return "bookform.jsp";
	   }
		   return "redirect:/";
	   }
	   
	   @PostMapping("/createbook")
		public String create(@Valid @ModelAttribute("book") Book book, BindingResult result,Model model, HttpSession session ) {
			if (result.hasErrors()) {
	           return "bookform.jsp";
	       } else {
	    	   Long userId = (Long) session.getAttribute("userId");
		   	   User currentUser = userServ.findUserById(userId);
		   	   book.setUser(currentUser);
	           bookService.createBook(book);
	           return "redirect:/book/new";
	       }
		}
	   @GetMapping("/books/{id}")
	   public String index3(@PathVariable("id")Long id, Model model) {
		   model.addAttribute("book", bookService.findBook(id));
		   return "show.jsp";	
	   }
	   
	   @GetMapping ("/bookmarket")
	   public String home2(Model model, HttpSession session){
	   	if (session.getAttribute("userId")!= null){
	   		Long userId = (Long) session.getAttribute("userId");
	   		User currentUser = userServ.findUserById(userId);
	   		model.addAttribute("currentUser", currentUser);	
	   		model.addAttribute("books",bookService.allbooks() );
	   		return "bookmarket.jsp";
	   	}
	   	return "redirect:/"; 	  		
	   }
	   @RequestMapping("/books/{id}/delete")
	   public String destroy(@PathVariable("id") Long id) {
           bookService.deleteBook(id);
           return "redirect:/bookmarket";
       }
	   @GetMapping("/books/{id}/edit")
	   public String edit(Model model,@PathVariable("id") Long id, HttpSession session) {
		   if (session.getAttribute("userId") == null){
			   return "redirect:/"; 
		   }
		   else {
		   model.addAttribute("book", bookService.findBook(id));
		   return "edit.jsp";
		   }
       }

	   @PutMapping("/books/{id}/edit")
	   public String edit52(@Valid @ModelAttribute("book") Book book,BindingResult result, HttpSession session) {
		   Long userId = (Long) session.getAttribute("userId");
	   		User currentUser = userServ.findUserById(userId);
		   if (result.hasErrors()) {
	            return "edit.jsp";
	        } else {
	        	book.setUser(currentUser);
	        	bookService.updateBook(book);
	        	return "edit.jsp";
	        }
        }
	   @RequestMapping("/books/{id}/borrow")
	   public String borrow(@PathVariable("id") Long id, HttpSession session,@ModelAttribute("book") Book book) {
		   Long userId = (Long) session.getAttribute("userId");
	   		User currentborrower = userServ.findUserById(userId);
	   		book.setBorrower(currentborrower);
	           return "redirect:/bookmarket";
	       }



	}