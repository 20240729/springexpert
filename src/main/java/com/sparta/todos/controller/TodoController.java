package com.sparta.todos.controller;

import com.sparta.todos.dto.TodoDetailResponseDto;
import com.sparta.todos.dto.TodoSaveRequestDto;
import com.sparta.todos.dto.TodoSaveResponseDto;
import com.sparta.todos.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @PostMapping("/todos")
    public TodoSaveResponseDto saveTodo(@RequestBody TodoSaveRequestDto todoSaveRequestDto){
        return todoService.saveTodo(todoSaveRequestDto);
    }

    @GetMapping("/todos/{todoId}")
    public TodoDetailResponseDto getTodo(@PathVariable Long todoId){
        return todoService.getTodo(todoId);
    }






}
