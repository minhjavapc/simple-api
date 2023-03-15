package com.likelion.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class DemoController {
    @GetMapping(value = "/")
    public String getTodoList() {
        return "get method";
    }
    @PostMapping(value = "/todo")
    public String addTodo() {
        return "post method";
    }
    @PutMapping(value = "/todo/{todoId}")
    public String editTodo() {
        return "put method";
    }
    @DeleteMapping(value = "/todo/{todoId}")
    public String deleteTodo() {
        return "delete method";
    }
}
