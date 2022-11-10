package com.axsos.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.dojoninja.models.Ninja;
import com.axsos.dojoninja.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final  NinjaRepository  ninjaRepository;

public NinjaService(NinjaRepository ninjaRepository) {
    this.ninjaRepository = ninjaRepository;
}
//returns all 
public List<Ninja> allNinja() {
    return ninjaRepository.findAll();
}
// creates 
public Ninja createNinja(Ninja a) {
    return ninjaRepository.save(a);
}
public Ninja findNinja(Long id) {
    Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
    if(optionalNinja.isPresent()) {
        return optionalNinja.get();
    } else {
        return null;
    }
}



}