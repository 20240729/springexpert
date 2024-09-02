package com.sparta.todos.dto;

import lombok.Getter;

@Getter
public class TodoUpdateRequestDto {
    private String title;
    private String contents;
    private String username;
}
