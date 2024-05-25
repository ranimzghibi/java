package com.example.gestionemp.models;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class EmployeeDto {
	@NotEmpty(message = "rempli le champ !!")
	private String name;
	@NotEmpty(message = "rempli le champ !!")
	private String position;
	@Min(0)
	private double salary;
	@NotEmpty(message = "rempli le champ !!")
	private String phoneNumber;
	@NotEmpty(message = "saisie l email")
	private String email;
	
	private MultipartFile image_file ;
	@NotNull
    private Integer departmentId; 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public MultipartFile getImage_file() {
		return image_file;
	}

	public void setImage_file(MultipartFile image_file) {
		this.image_file = image_file;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	

}
