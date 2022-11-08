package com.axsos.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.axsos.savetravels.models.Expense;
import com.axsos.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	private final ExpenseRepository expenseRepository;
    
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
    // returns all 
    public List<Expense> allexpense() {
        return expenseRepository.findAll();
    }
    // creates 
    public Expense createexpense(Expense a) {
        return expenseRepository.save(a);
    }
    public Expense findexpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
    // update 
    public Expense updateexpense(Expense a) {
        return expenseRepository.save(a);
    }
    // delete
    public void deleteexpense(Long id) {
    	expenseRepository.deleteById(id);
    }
}
