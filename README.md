# Learned Testing Tools Management System

![banner]

This web application allows users to manage their learned testing tools. Users can view, search, add, update, and delete tools from a table. Each tool has a name, difficulty, language, and learned status.

## Table of Contents

- Requirements
- Installation
- Usage

## Requirements

- Java 11 or higher
- Maven 3.6.3 or higher
- Spring Boot 2.5.6 or higher
- Thymeleaf 3.0.12 or higher
- Bootstrap 5.1.3 or higher

## Installation

Clone this repository and navigate to the project directory.


    git clone https://github.com/your-username/learned-testing-tools.git
    cd learned-testing-tools

## Build the project using Maven.

    cmvn clean install

## Run the project using Spring Boot.

    mvn spring-boot:run

## The application will be available at http://localhost:8080.

## Usage

### To use the application, follow these steps:

- Open your browser and go to http://localhost:8080.
- You will see a table with some testing tools that are already added. You can sort the table by clicking on the column headers. You can also search for a specific tool by typing in the search box.
- To add a new tool, click on the “Add Tool” button at the top right corner. A form will appear where you can enter the tool’s name, difficulty, language, and learned status. Click on the “Save” button to save the tool to the table.
- To update an existing tool, click on the “Update” button in the corresponding row. A form will appear where you can edit the tool’s information. Click on the “Save” button to save the changes to the table.
- To delete an existing tool, click on the “Delete” button in the corresponding row. A confirmation message will appear where you can click on the “Yes” button to delete the tool from the table.- 
