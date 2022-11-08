package com.axsos.savetravels.controllers;

import java.awt.print.Expense;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.axsos.savetravels.models.Expense;
import com.axsos.savetravels.services.ExpenseService;

@Controller
public class ExpenseController {
	private final ExpenseService expenseService;
    public ExpenseController(ExpenseService expenseService){
      this.expenseService = expenseService;
  }
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense") Expense expense,Model model) {
		model.addAttribute("expenses",expenseService.allexpense()); //we add Model model to show inform on .jsp 
		return "index.jsp";
	}
	
	 @PostMapping("/expenses")
	 public String index2(@Valid @ModelAttribute("expense") Expense expense, BindingResult result,Model model) {
		 model.addAttribute("expenses",expenseService.allexpense());  //we add Model model to show inform on .jsp 
		 if (result.hasErrors()) {
	            return "index.jsp";
	        } else {
	        	expenseService.createexpense(expense);
	            return "redirect:/expenses";
	        }
	 }
	    @GetMapping("/expenses/{id}/edit")
	    public String edit(@PathVariable("id") Long id, Model model) {
	        Expense expense = expenseService.findexpense(id);
	        model.addAttribute("expense", expense);
	        return "/expenses/edit.jsp";
	    }
	    @PutMapping("/expenses/{id}")
	    public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/expenses/edit.jsp";
	        } else {
	            expenseService.updateExpense(expense);
	            return "redirect:/expenses";
	        }
	    }

}
