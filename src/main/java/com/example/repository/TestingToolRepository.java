package com.example.repository;

import com.example.model.TestingTool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestingToolRepository extends JpaRepository<TestingTool,Integer> {
}
