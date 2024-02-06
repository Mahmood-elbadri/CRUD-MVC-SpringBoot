package com.example.service;

import java.util.List;

import com.example.model.TestingTool;


public interface TestingToolService {
    List<TestingTool> getTools();
    TestingTool getTool(int id);
    TestingTool updateTool(int id,TestingTool testingTool);
    TestingTool createTool(TestingTool testingTool);
    void removeTool(int id);
}
