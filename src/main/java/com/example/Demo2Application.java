package com.example;

import com.example.model.TestingTool;
import com.example.repository.TestingToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

    @Autowired
    private TestingToolRepository toolRepository;
    @Override
    public void run(String... args) throws Exception {
        TestingTool tool = new TestingTool("selenium","java",true,"easy");
        toolRepository.save(tool);
        TestingTool tool1 = new TestingTool("Maven","xml",false,"easy");
        toolRepository.save(tool1);
        TestingTool tool2 = new TestingTool("Cucumber","java",false,"easy");
        toolRepository.save(tool2);
        TestingTool tool3 = new TestingTool("selenium","java",false,"easy");
        toolRepository.save(tool3);
        TestingTool tool4 = new TestingTool("selenium","java",false,"easy");
        toolRepository.save(tool4);
    }
}
