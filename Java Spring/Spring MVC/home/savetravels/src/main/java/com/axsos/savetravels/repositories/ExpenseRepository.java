package com.axsos.savetravels.repositories;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.savetravels.models.User;
@Repository
public interface ExpenseRepository extends CrudRepository<User, Long>{
	Optional<User> findByEmail(String email);
}
