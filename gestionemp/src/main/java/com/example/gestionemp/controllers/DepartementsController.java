package com.example.gestionemp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.gestionemp.models.Department;
import com.example.gestionemp.models.EmployeeDto;
import com.example.gestionemp.services.departementsRepsotory;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/departments")
public class DepartementsController {
	@Autowired
    private departementsRepsotory repo;
	@GetMapping("/")
    public String showDepartmentsList(Model model) {
        List<Department> departments = repo.findAll();
        model.addAttribute("Department", departments);
        return "/employees/department_acceuil";
    }
	@GetMapping("/create")
	public String showCreatePage(Model model) {
	    Department department = new Department(); 
	    model.addAttribute("department", department); 
	    return "/employees/createDepartment";
	}
	@PostMapping("/create")
	public String createPage(@Valid @ModelAttribute Department dep, BindingResult result, Model model) {
	   
	    if (result.hasErrors()) {
	        return "/employees/createDepartment";
	    }
	    repo.save(dep);
	    return "redirect:/departments/"; 
	}



}
