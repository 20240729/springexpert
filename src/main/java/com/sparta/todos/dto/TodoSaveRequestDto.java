package com.sparta.todos.dto;

import lombok.Getter;

@Getter
public class TodoSaveRequestDto {
    private String title;
    private String contents;
    private String username;
}
