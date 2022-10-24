package com.github.kacperchm.todoapp.adapter;

import com.github.kacperchm.todoapp.model.TaskGroup;
import com.github.kacperchm.todoapp.model.TaskGroupRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SqlTaskGroupRepository extends TaskGroupRepository, JpaRepository<TaskGroup, Integer> {
    @Override
    @Query("FROM TaskGroup g JOIN FETCH g.tasks")
    List<TaskGroup> findAll();
}
