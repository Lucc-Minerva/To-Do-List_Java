package br.com.luaccminerva.todolist.task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public class ITaskRepository extends JpaRepository<TaskModel, UUID>{
    
}