package com.example.controller;

import com.example.model.TestingTool;
import com.example.service.TestingToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ToolController {
    TestingToolService toolService;

    @Autowired
    public ToolController(TestingToolService toolService) {
        this.toolService = toolService;
    }

    @GetMapping("/tools/new")
    public String createTool(Model model) {
        TestingTool tool = new TestingTool();
        model.addAttribute("tool", tool);
        return "add_tool";
    }

    @PostMapping("tools/create")
    public String saveTool(@ModelAttribute("tool") TestingTool tool) {
        toolService.createTool(tool);
        return "redirect:/tools";
    }

    @GetMapping("tools")
    public String getTools(Model model) {
        model.addAttribute("tools", toolService.getTools());
        return "tools";
    }

    @GetMapping("/edit/{id}")
    public String editTool(@PathVariable int id, Model model) {
        model.addAttribute("tool", toolService.getTool(id));
        return "edit_tool";
    }

    @PostMapping("/tools/{id}")
    public String updateTool(@PathVariable int id, TestingTool tool) {
        toolService.updateTool(id, tool);
        return "redirect:/tools";
    }

    @GetMapping("/tools/remove/{id}")
    public String removeTool(@PathVariable int id) {
        toolService.removeTool(id);
        return "redirect:/tools";
    }

}
