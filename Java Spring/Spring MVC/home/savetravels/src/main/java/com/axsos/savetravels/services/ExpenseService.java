package com.axsos.savetravels.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import org.springframework.validation.BindingResult;

import com.axsos.savetravels.models.LoginUser;
import com.axsos.savetravels.models.User;
import com.axsos.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository userRepo;  
	public ExpenseService(ExpenseRepository userRepo) {
    this.userRepo = userRepo;
	}
public User register(User newUser, BindingResult result) {
	Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
	if (potentialUser.isPresent()) {
		result.rejectValue("email","matches", "");
	}
	if(!newUser.getPassword().equals(newUser.getConfirm())) {
	    result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
	}
	return --;
	
  }
public User login(LoginUser newLogin, BindingResult result) {
	Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
	
	if (potentialUser.isPresent()) {
		result.rejectValue("email","matches", "un known email");
		return null;
	}
	return --;
}
}


	

