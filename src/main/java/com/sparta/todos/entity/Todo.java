package com.sparta.todos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Todo extends Timestamped{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String contents;

    private String username;

    public Todo(String title, String contents, String username) {
        this.title = title;
        this.contents = contents;
        this.username = username;
    }

    public void update(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}
