package com.axsos.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.languages.models.Language;
import com.axsos.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository langRepo;

	public LanguageService(LanguageRepository langRepo) {
		this.langRepo = langRepo;
	}
    // returns all 
    public List<Language> all_lang() {
        return langRepo.findAll();
    }
    // creates 
    public Language create_lang(Language a) {
        return langRepo.save(a);
    }
    // find by id 
    public Language find_lang(Long id) {
        Optional<Language> optionalLanguage = langRepo.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
    // update 
    public Language update_lange(Language a) {
        return langRepo.save(a);
    }
    // delete
    public void delete_lang(Long id) {
    	langRepo.deleteById(id);
    }
}
