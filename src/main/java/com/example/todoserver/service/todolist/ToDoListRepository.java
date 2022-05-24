package com.example.todoserver.service.todolist;

import com.example.todoserver.entity.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface ToDoListRepository extends JpaRepository<ToDoList, Long> {

    @Query("SELECT td FROM ToDoList  td WHERE td.user_id = :userId")
    List<ToDoList> findByUserId(Long userId);

    @Modifying
    @Transactional
    @Query("UPDATE ToDoList td SET td.checked = TRUE WHERE td.id =:taskId")
    void taskChecked(Long taskId);

}
