package com.axsos.login.contollers;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsos.login.models.LoginUser;
import com.axsos.login.models.Project;
import com.axsos.login.models.User;
import com.axsos.login.services.ProjectService;
import com.axsos.login.services.UserService;

@Controller
public class UserController {
	
	@Autowired
    private UserService userServ;
	@Autowired
    private ProjectService projectService;
   
   @GetMapping("/")
   public String index(Model model, HttpSession session) {
   	if (session.getAttribute("userId")!= null){
   		return "redirect:/dashboard";
   	}
       model.addAttribute("newUser", new User());
       model.addAttribute("newLogin", new LoginUser());
       return "Form.jsp";
   }
   
   @PostMapping("/register")
   public String register(@Valid @ModelAttribute("newUser") User newUser, 
           BindingResult result, Model model, HttpSession session) {
   User registeredUser = userServ.register(newUser, result);
       
       if(result.hasErrors()) {   
           model.addAttribute("newLogin", new LoginUser());
           return "Form.jsp";
       }
       session.setAttribute("userId", registeredUser.getId());
       return "redirect:/dashboard";   
   }
   
   @PostMapping("/login")
   public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
       BindingResult result, Model model, HttpSession session) {
       User user = userServ.login(newLogin, result);
       if(result.hasErrors()) {
           model.addAttribute("newUser", new User());
           return "Form.jsp";
       }  
       session.setAttribute("userId", user.getId());
       return "redirect:/dashboard";
   }
   
   @GetMapping ("/logout")
   public String logout(HttpSession session){
   	session.invalidate();
   	return "redirect:/";		
   }
   
   //////////////////////////////////////////////////////////////////////
   // render main page
   @GetMapping ("/dashboard")
   public String home(Model model, HttpSession session){
   	if (session.getAttribute("userId")!= null){
   		Long userId = (Long) session.getAttribute("userId");
   		User currentUser = userServ.findUserById(userId);
   		model.addAttribute("currentUser", currentUser);	
   		/////
   		model.addAttribute("projects", projectService.allprojects());	
   		////
   		return "Home.jsp";
   	}
   	return "redirect:/";	  		
   }
   
   // render form page
   @GetMapping("/projects/new")
   public String index2(HttpSession session,@ModelAttribute("project") Project project) {
   	if (session.getAttribute("userId")== null){
   		return "redirect:/";
   	}
   	else {
       return "projectform.jsp";
   	}
   }
   
 @PostMapping("/createproject")
	public String create(@Valid @ModelAttribute("project") Project project, BindingResult result,Model model, HttpSession session ) {
		if (result.hasErrors()) {
         return "projectform.jsp";
     } else {
  	   	   Long userId = (Long) session.getAttribute("userId");
	   	   User currentUser = userServ.findUserById(userId);
	   	   project.setLeader(currentUser);
         projectService.createProject(project);
         return "redirect:/projects/new";
     }
	}
   
   
   // render edit page
   @GetMapping("/projects/edit")
   public String index3(HttpSession session,@ModelAttribute("project") Project project) {
   	if (session.getAttribute("userId")== null){
   		return "redirect:/";
   	}
   	else {
       return "edit.jsp";
   	}
   }

}