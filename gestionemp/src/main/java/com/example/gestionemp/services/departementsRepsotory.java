package com.example.gestionemp.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestionemp.models.Department;

public interface departementsRepsotory extends JpaRepository<Department,Integer>{
	

}
