package com.example.service.imp;

import com.example.model.TestingTool;
import com.example.repository.TestingToolRepository;
import com.example.service.TestingToolService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestingToolServiceImp implements TestingToolService {

    TestingToolRepository toolRepository;

    public TestingToolServiceImp(TestingToolRepository toolRepository) {
        this.toolRepository = toolRepository;
    }

    @Override
    public List<TestingTool> getTools() {
        return toolRepository.findAll();
    }

    @Override
    public TestingTool getTool(int id) {
        return toolRepository.findById(id).get();
    }

    @Override
    public TestingTool updateTool(int id, TestingTool testingTool) {
        TestingTool tool = toolRepository.findById(id).get();
        tool.setId(testingTool.getId());
        tool.setName(testingTool.getName());
        tool.setDifficulty(testingTool.getDifficulty());
        tool.setLanguage(testingTool.getLanguage());
        tool.setLearned(testingTool.isLearned());
        toolRepository.save(tool);
        return tool;
    }

    @Override
    public TestingTool createTool(TestingTool testingTool) {
        return toolRepository.save(testingTool);
    }

    @Override
    public void removeTool(int id) {
        toolRepository.deleteById(id);
    }
}
