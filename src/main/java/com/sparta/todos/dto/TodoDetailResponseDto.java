package com.sparta.todos.dto;

import lombok.Getter;

@Getter
public class TodoDetailResponseDto {
    private Long id;
    private String title;
    private String contents;
    private String username;

    public TodoDetailResponseDto(Long id, String title, String contents, String username) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.username = username;
    }
}
