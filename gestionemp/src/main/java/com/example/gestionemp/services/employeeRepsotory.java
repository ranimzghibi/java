package com.example.gestionemp.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestionemp.models.Employee;

public interface employeeRepsotory extends JpaRepository<Employee,Integer>{

	List<Employee> findByDepartment_Id(int departmentId);

	Employee findByEmail(String email);

}
