# Student Planner API

A RESTful backend API built with Spring Boot for managing university courses and deadlines.

## Tech Stack
- Java 25
- Spring Boot 3.5
- Spring Data JPA
- H2 In-Memory Database
- Maven

## Features
- Create, read, update and delete courses
- Add deadlines linked to specific courses
- Mark deadlines as completed

## Endpoints

### Courses
| Method | URL | Description |
|--------|-----|-------------|
| GET | /courses | Get all courses |
| POST | /courses | Add a new course |
| PUT | /courses/{id} | Update a course |
| DELETE | /courses/{id} | Delete a course |

### Deadlines
| Method | URL | Description |
|--------|-----|-------------|
| GET | /deadlines | Get all deadlines |
| POST | /deadlines?courseId={id} | Add a deadline to a course |
| PUT | /deadlines/{id}/complete | Mark a deadline as done |
| DELETE | /deadlines/{id} | Delete a deadline |

## Running the Project
1. Clone the repo
2. Open in IntelliJ IDEA
3. Run `StudentplannerApplication.java`
4. API is available at `http://localhost:8080`
