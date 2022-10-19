package com.github.kacperchm.todoapp.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    List<Task> findAll();
    Optional<Task> findById(Integer i);

    boolean existsById(Integer id);

    Page<Task> findAll(Pageable page);

    Task save(Task entity);

    List<Task> findByDone(@Param("state") boolean done);
}
