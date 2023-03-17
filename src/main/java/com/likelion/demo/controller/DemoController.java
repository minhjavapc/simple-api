package com.likelion.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/restindex")
    private String test2(){
        String result = restTemplate.getForObject("http://10.0.31.91:8081/dataway/index", String.class);
        return result;
    }

    @GetMapping(value = "/")
    public String index() {
        return "simple";
    }
    @GetMapping(value = "/simple/index")
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