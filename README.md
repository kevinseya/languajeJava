# Spring Java Project

## Description
This project is a simple Spring Boot application that serves as a starting point for building web applications with Java. The structure includes basic configurations and setup for Spring, making it easy to extend and develop further.

## Features
- **Spring Boot**: A framework for building Java-based web applications.
- **Maven**: Dependency management and build automation.
- **Java**: The programming language used for the backend logic.
- **Basic Project Structure**: Includes essential folders and files to get started, such as `src/`, `pom.xml`, and basic Spring Boot configurations.

## Prerequisites
Before running this project, ensure you have the following software installed:

- **JDK 20 or higher**: The Java Development Kit (JDK) is required to build and run the project.
- **Maven**: Used for dependency management and building the project.
- **IDE**: Use an Integrated Development Environment like IntelliJ IDEA, Eclipse, or Visual Studio Code for easier development and debugging.

## Getting Started

### 1. Clone the repository:
To get started with this project, first clone the repository to your local machine:
```bash
git clone https://github.com/kevinseya/languajeJava.git
```

### 2. Run the application:
After cloning, you can start the application by navigating to the project directory and using Maven to run it:
```bash
mvn spring-boot:run
```

### Run the image of Docker Hub

You can pull and run it on any machine that has Docker installed
```bash
docker pull kevinseya/languaje-java-app:latest

docker run -p 8001:8001 kevinseya/languaje-java-app:latest
```
### Usage
Once the application is running, you can access it at http://localhost:8001.

### Deployed in service PAAS Digital Ocean

https://languaje-java-j8l5j.ondigitalocean.app/

### CI/CD 
Continuous deployment using workflow for the qa branch and the main branch

