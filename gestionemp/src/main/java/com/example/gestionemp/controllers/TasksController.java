package com.example.gestionemp.controllers;

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

import com.example.gestionemp.models.Employee;
import com.example.gestionemp.models.Task;
import com.example.gestionemp.models.TaskDto;
import com.example.gestionemp.services.employeeRepsotory;

import com.example.gestionemp.services.TaskRepository;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/tasks")
public class TasksController {
    @Autowired
    private TaskRepository taskRepo;

    @Autowired
    private employeeRepsotory employeeRepo;

    @GetMapping("/create")
    public String showCreateTaskPage(Model model) {
        TaskDto taskDto = new TaskDto();
        List<Employee> employees = employeeRepo.findAll();
        model.addAttribute("taskDto", taskDto);
        model.addAttribute("employees", employees);
        return "/employees/createTask";
    }

    @PostMapping("/create")
    public String createTask(@Valid @ModelAttribute TaskDto taskDto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Employee> employees = employeeRepo.findAll();
            model.addAttribute("taskDto", taskDto);
            model.addAttribute("employees", employees);
            return "/employees/createTask";
        }

        Task task = new Task();
        task.setName(taskDto.getName());
        task.setDescription(taskDto.getDescription());
        task.setEmployee(employeeRepo.findById(taskDto.getEmployeeId()).orElse(null));
        taskRepo.save(task);

        return "redirect:/tasks/";
    }

    @GetMapping("/")
    public String showTasksList(Model model) {
        List<Task> tasks = taskRepo.findAll();
        model.addAttribute("tasks", tasks);
        return "/employees/listTache";
    }
}
