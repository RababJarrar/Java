package com.axsos.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.dojoninja.models.Dojo;
import com.axsos.dojoninja.repositories.DojoRepository;

@Service
public class DojoService {
	private final  DojoRepository  dojoRepository;

public DojoService(DojoRepository dojoRepository) {
    this.dojoRepository = dojoRepository;
}
//returns all 
public List<Dojo> allDojo() {
    return dojoRepository.findAll();
}
// creates 
public Dojo createDojo(Dojo a) {
    return dojoRepository.save(a);
}
public Dojo findDojo(Long id) {
    Optional<Dojo> optionalDojo = dojoRepository.findById(id);
    if(optionalDojo.isPresent()) {
        return optionalDojo.get();
    } else {
        return null;
    }
}

}