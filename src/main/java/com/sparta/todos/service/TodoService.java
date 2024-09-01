package com.sparta.todos.service;

import com.sparta.todos.dto.TodoDetailResponseDto;
import com.sparta.todos.dto.TodoSaveRequestDto;
import com.sparta.todos.dto.TodoSaveResponseDto;
import com.sparta.todos.entity.Todo;
import com.sparta.todos.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TodoService {
    private final TodoRepository todoRepository;

    @Transactional
    public TodoSaveResponseDto saveTodo(TodoSaveRequestDto todoSaveRequestDto) {
        Todo newTodo = new Todo(
                todoSaveRequestDto.getTitle(),
                todoSaveRequestDto.getContents(),
                todoSaveRequestDto.getUsername()
        );
        Todo savedTodo = todoRepository.save(newTodo);

        return new TodoSaveResponseDto(
                savedTodo.getId(),
                savedTodo.getTitle(),
                savedTodo.getContents(),
                savedTodo.getUsername()
        );
    }

    public TodoDetailResponseDto getTodo(Long todoId) {
        Todo todo = todoRepository.findById(todoId).orElseThrow(
                ()-> new NullPointerException("Todo with id " + todoId + " not found")
        );

        return new TodoDetailResponseDto(
                todo.getId(),
                todo.getTitle(),
                todo.getContents(),
                todo.getUsername()
        );
    }
}
