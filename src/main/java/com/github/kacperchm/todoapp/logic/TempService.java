package com.github.kacperchm.todoapp.logic;

import com.github.kacperchm.todoapp.model.Task;
import com.github.kacperchm.todoapp.model.TaskGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TempService {

    @Autowired
    List<String> temp(TaskGroupRepository repository) {
       return repository.findAll().stream()
               .flatMap(taskGroup -> taskGroup.getTasks().stream())
               .map(Task::getDescription)
               .collect(Collectors.toList());
    }
}
