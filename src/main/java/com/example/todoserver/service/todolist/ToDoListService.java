package com.example.todoserver.service.todolist;

import com.example.todoserver.entity.ToDoList;
import com.example.todoserver.service.todolist.ToDoListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoListService {

    private ToDoListRepository toDoListRepository;

    public ToDoListService(ToDoListRepository toDoListRepository) {
        this.toDoListRepository = toDoListRepository;
    }

    public List<ToDoList> getAllList(){
        return toDoListRepository.findAll();
    }

    public List<ToDoList> getListByUserId(Long userId){
        boolean exists = toDoListRepository.existsById(userId);
        if (!exists){
            throw new IllegalStateException("user does not exists");
        }
        return toDoListRepository.findByUserId(userId);
    }

    public ToDoList save(ToDoList toDoList){
        return toDoListRepository.save(toDoList);
    }

    public void deleteByTaskId(Long userId, Long taskId){
        boolean exists = toDoListRepository.existsById(taskId);
        if (!exists){
            throw new IllegalStateException("task does not exists");
        }
        toDoListRepository.deleteById(taskId);
    }

    public void deleteTask(Long taskId){
        boolean exists = toDoListRepository.existsById(taskId);
        if (!exists){
            throw new IllegalStateException("task does not exists");
        }
        toDoListRepository.deleteById(taskId);
    }

    public void taskChecked(Long taskId){
        toDoListRepository.taskChecked(taskId);
    }
}
