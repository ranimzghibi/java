package com.example.gestionemp.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.example.gestionemp.models.Employee;
import com.example.gestionemp.models.EmployeeDto;
import com.example.gestionemp.models.Department;
import com.example.gestionemp.services.employeeRepsotory;
import com.example.gestionemp.services.departementsRepsotory;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/employees")
public class EmployeesController {
    @Autowired
    private employeeRepsotory employeeRepo;

    @Autowired
    private departementsRepsotory departmentRepo;

    private String getImageUrl(String imageFileName) {
        // Construisez l'URL de l'image à partir du nom du fichier
        return "/images/" + imageFileName;
    }

    @GetMapping("/")
    public String showEmployeesList(Model model) {
        List<Employee> employees = employeeRepo.findAll();

        // Pour chaque employé, mettez à jour l'URL de l'image
        employees.forEach(employee -> {
            employee.setImageUrl(getImageUrl(employee.getImage_file()));
        });

        model.addAttribute("employees", employees);
        return "/employees/list";
    }

    @GetMapping("/create")
    public String showCreatePage(Model model) {
        EmployeeDto empdto = new EmployeeDto();
        List<Department> departments = departmentRepo.findAll();
        model.addAttribute("empdto", empdto);
        model.addAttribute("departments", departments);
        return "/employees/createEmployee";
    }

    @PostMapping("/create")
    public String createPage(@Valid @ModelAttribute EmployeeDto empdto, BindingResult result, Model model) {
        if (empdto.getImage_file().isEmpty()) {
            result.addError(new FieldError("empdto", "imageFile", "Sélectionnez une image"));
        }
        if (result.hasErrors()) {
            List<Department> departments = departmentRepo.findAll();
            model.addAttribute("empdto", empdto);
            model.addAttribute("departments", departments);
            return "/employees/createEmployee";
        }

        MultipartFile image = empdto.getImage_file();
        Date createdAt = new Date();
        String storageFileName = createdAt.getTime() + "_" + image.getOriginalFilename();

        try {
            String uploadDir = "public/images/";
            Path uploadPath = Paths.get(uploadDir);

            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            try (InputStream inputStream = image.getInputStream()) {
                Files.copy(inputStream, Paths.get(uploadDir + storageFileName), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception ex) {
                System.out.println("Exception: " + ex.getMessage());
            }

            Employee employee = new Employee();
            employee.setName(empdto.getName());
            employee.setPosition(empdto.getPosition());
            employee.setSalary(empdto.getSalary());
            employee.setPhoneNumber(empdto.getPhoneNumber());
            employee.setEmail(empdto.getEmail());
            employee.setImage_file(storageFileName);
            employee.setDepartment(departmentRepo.findById(empdto.getDepartmentId()).orElse(null));

            employeeRepo.save(employee);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/employees/";
    }

    @GetMapping("/edit/{id}")
    public String showEditPage(Model model, @PathVariable int id) {
        try {
            Employee emp = employeeRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Employee not found with id: " + id));
            List<Department> departments = departmentRepo.findAll();
            model.addAttribute("employee", emp);

            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setName(emp.getName());
            employeeDto.setPosition(emp.getPosition());
            employeeDto.setSalary(emp.getSalary());
            employeeDto.setPhoneNumber(emp.getPhoneNumber());
            employeeDto.setEmail(emp.getEmail());
            employeeDto.setDepartmentId(emp.getDepartment().getId());

            model.addAttribute("empdto", employeeDto);
            model.addAttribute("departments", departments);

            return "/employees/editEmployee";
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            return "redirect:/employees/";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        try {
            Employee employee = employeeRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Employee not found with id: " + id));

            String imageFileName = employee.getImage_file();
            if (imageFileName != null && !imageFileName.isEmpty()) {
                Path imagePath = Paths.get("public/images/" + imageFileName);
                Files.deleteIfExists(imagePath);
            }
            employeeRepo.delete(employee);
            return "redirect:/employees/";
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            return "redirect:/employees/";
        }
    }

    @PostMapping("/update/{id}")
    public String updateEmployee(@PathVariable int id, @Valid @ModelAttribute EmployeeDto empdto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Department> departments = departmentRepo.findAll();
            model.addAttribute("empdto", empdto);
            model.addAttribute("departments", departments);
            return "/employees/editEmployee";
        }

        try {
            Employee employee = employeeRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Employee not found with id: " + id));

            employee.setName(empdto.getName());
            employee.setPosition(empdto.getPosition());
            employee.setSalary(empdto.getSalary());
            employee.setPhoneNumber(empdto.getPhoneNumber());
            employee.setEmail(empdto.getEmail());
            employee.setDepartment(departmentRepo.findById(empdto.getDepartmentId()).orElse(null));

            employeeRepo.save(employee);

        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }

        return "redirect:/employees/";
    }

    @GetMapping("/details/{departmentId}")
    public String getEmployeesByDepartment(@PathVariable int departmentId, Model model) {
        List<Employee> employees = employeeRepo.findByDepartment_Id(departmentId); 
        model.addAttribute("employees", employees);
        return "/employees/emp_dep";
    }
}
