package com.henriqueagustini.todolist.service;

import com.henriqueagustini.todolist.model.Task;
import com.henriqueagustini.todolist.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask (Task task) {
        return  taskRepository.save(task);
    }
}
