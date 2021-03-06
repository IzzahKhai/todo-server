package com.example.todoserver.controller;

import com.example.todoserver.entity.ToDoList;
import com.example.todoserver.service.todolist.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ToDoListController {

    @Autowired
    private ToDoListService toDoListService;

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    @ResponseBody
    public List<ToDoList> getAllTask(){
        return toDoListService.getAllList();
    }

    @RequestMapping(value = "/tasks/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public List<ToDoList> getTaskByUserId(@PathVariable Long userId){
        return toDoListService.getListByUserId(userId);
    }

    @RequestMapping(value = "task", method = RequestMethod.POST)
    @ResponseBody
    public ToDoList saveTask(@RequestBody ToDoList toDoList){
        return toDoListService.save(toDoList);
    }

    @RequestMapping(value = "task/{userId}/{taskId}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteTask(@PathVariable Long userId,
                           @PathVariable Long taskId){
        toDoListService.deleteByTaskId(userId, taskId);
    }

    @RequestMapping(value = "task/{taskId}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteByTaskId(@PathVariable Long taskId){
        toDoListService.deleteTask(taskId);
    }

    @RequestMapping(value = "task/{taskId}/checked", method = RequestMethod.PUT)
    @ResponseBody
    public void checkedTask(@PathVariable Long taskId){
        toDoListService.taskChecked(taskId);
    }
}
