package com.example.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tools")
public class TestingTool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "tool_name")
    String name;
    @Column(name = "tool_language")
    String language;
    @Column
    boolean learned;
    @Column
    String difficulty;

    public TestingTool() {
    }

    public TestingTool(String name, String language, boolean learned, String difficulty) {
        this.name = name;
        this.language = language;
        this.learned = learned;
        this.difficulty = difficulty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isLearned() {
        return learned;
    }

    public void setLearned(boolean learned) {
        this.learned = learned;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
