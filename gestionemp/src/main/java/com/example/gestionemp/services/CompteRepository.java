package com.example.gestionemp.services;

import com.example.gestionemp.models.Compte;
import com.example.gestionemp.models.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {

  
}
