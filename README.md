# springboot
# 🛠️ Spring Boot CRUD Project - Software Engineers

This is a simple CRUD (Create, Read, Update, Delete) REST API application built using **Spring Boot**, **Spring Data JPA**, and **PostgreSQL**. It manages `SoftwareEngineer` entities and demonstrates basic API operations with database connectivity.

## 📁 Project Structure

**src/main/java/com/Baseer/CURD/project/**
**├── CurdProjectApplication.java # Main Spring Boot application**
**├── SoftwareEngineer.java # JPA Entity**
**├── SoftwareEngineerController.java # REST Controller**
**├── SoftwareEngineerService.java # Business logic**
**└── SoftwareEngineerRepository.java # JPA Repository**


## 🚀 Features

- Create a new software engineer 👨‍💻
- Fetch all engineers 🧑‍💻
- Fetch a single engineer by ID 🔍
- Spring Boot RESTful API with JSON responses
- PostgreSQL database integration
- Docker support for the database setup

---

## 🔗 API Endpoints

| Method | Endpoint                              | Description                       |
|--------|----------------------------------------|-----------------------------------|
| GET    | `/`                                    | Test endpoint (Hello World)       |
| GET    | `/api/v1/software-engineers`           | Get all engineers                 |
| GET    | `/api/v1/software-engineers/{id}`      | Get engineer by ID                |
| POST   | `/api/v1/software-engineers`           | Add a new engineer                |

📌 **POST Body Example** (Content-Type: `application/json`):
```json
{
  "name": "Baseer",
  "techStack": "Spring Boot, Java"
}
```
##  🐳 Dockerized PostgreSQL Setup

You can run a PostgreSQL container using the provided Docker Compose file.
📄 docker-compose.yml

version: '3.8'

services:
  db:
    container_name: postgres-spring-boot
    image: postgres:latest
    environment:
      POSTGRES_USER: amigoscode
      POSTGRES_PASSWORD: password
      PGDATA: /data/postgres
    volumes:
       - db:/data/postgres
    ports:
      - "5332:5432"
    networks:
      - db
    restart: unless-stopped

networks:
  db:
    driver: bridge

volumes:
  db:


## ⚙️ Getting Started
Prerequisites

**Java 17+**

**Maven**

**Docker & Docker Compose**

# Steps
# Clone the repository
git clone https://github.com/<your-username>/springboot-crud.git
cd springboot-crud

# Run PostgreSQL using Docker Compose
docker-compose up -d

# Run the Spring Boot app
./mvnw spring-boot:run


  # Visit the API

   Base URL: http://localhost:8080

   Example: http://localhost:8080/api/v1/software-engineers

## 🔧 Database Configuration

Make sure to configure your application.properties (or application.yml) as:

spring.datasource.url=jdbc:postgresql://localhost:5332/postgres
spring.datasource.username=amigoscode
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true



## 📄 License

**This project is licensed under the MIT License.**

## 🙋‍♂️ Author

**Baseer S**

- 🐙 GitHub: [@Baseer-S](https://github.com/Baseer-S)
- 🌐 Portfolio: [baseer-s.github.io/My_Portfolio](https://baseer-s.github.io/My_Portfolio/)
- 🔗 LinkedIn: [Baseer S](https://linkedin.com/in/baseer-s)

## ✅ To use it:
1. Create a file in your project root named `README.md`.
2. Paste the above Markdown content into it.
3. Replace `<your-username>` with your actual GitHub username in the clone command.
4. Add any additional sections like screenshots or deployment links as needed.

Let me know if you'd like a README badge version or Tamil translation too.
