package com.axsos.savetravels.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.axsos.savetravels.models.Expense;
import com.axsos.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	private final ExpenseRepository expenseRepository;
    
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
    // returns all the books
    public List<Expense> allexpense() {
        return expenseRepository.findAll();
    }
    // creates a book
    public Expense createexpense(Expense a) {
        return expenseRepository.save(a);
    }
}
