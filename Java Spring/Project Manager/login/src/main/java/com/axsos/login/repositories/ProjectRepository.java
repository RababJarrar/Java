package com.axsos.login.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.axsos.login.models.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	List<Project> findAll();
}