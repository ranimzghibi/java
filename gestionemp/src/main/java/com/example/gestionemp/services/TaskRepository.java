package com.example.gestionemp.services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.gestionemp.models.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
