package com.example.gestionemp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String motDePasse;

    @OneToOne
    private Employee employee;

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public String getMotDePasse() {
		
		return motDePasse;
	}

	public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
