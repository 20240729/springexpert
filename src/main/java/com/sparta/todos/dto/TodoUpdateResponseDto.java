package com.sparta.todos.dto;

import lombok.Getter;

@Getter
public class TodoUpdateResponseDto {
    private final Long id;
    private final String title;
    private final String contents;
    private final String username;

    public TodoUpdateResponseDto(Long id, String title, String contents, String username) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.username = username;
    }
}
