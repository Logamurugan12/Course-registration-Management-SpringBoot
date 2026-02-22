# 📚 Student Registration & Course Management System

A full-stack web application built with **Java Spring Boot** for managing student registrations and course enrollments. This project demonstrates RESTful API development, relational database design, and responsive frontend integration.

---

## 🚀 Tech Stack

| Layer | Technology |
|-------|-----------|
| Backend | Java, Spring Boot |
| API | RESTful APIs |
| Database | MySQL |
| DB Connectivity | JDBC |
| Frontend | HTML5, CSS3, JavaScript |

---

## ✨ Features

- ✅ Register and manage student records
- ✅ Add and manage courses
- ✅ Enroll students into courses
- ✅ View enrolled students per course
- ✅ RESTful APIs with 10+ endpoints
- ✅ Responsive frontend with dynamic data rendering
- ✅ Transaction management for data integrity

---

## 🗄️ Database Schema

**Tables:**
- `Students` — stores student details
- `Courses` — stores course information
- `Enrollments` — manages student-course relationships (foreign keys)

---

## 📁 Project Structure

```
student-management/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/studentmgmt/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       └── model/
│   │   └── resources/
│   │       └── application.properties
├── frontend/
│   ├── index.html
│   ├── style.css
│   └── script.js
└── README.md
```

---

## ⚙️ How to Run

### Prerequisites
- Java 17+
- MySQL
- Maven

### Steps

```bash
# 1. Clone the repository
git clone https://github.com/Logamurugan12/student-management.git

# 2. Create MySQL database
CREATE DATABASE studentdb;

# 3. Update application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=your_username
spring.datasource.password=your_password

# 4. Run the application
mvn spring-boot:run

# 5. Open frontend
Open index.html in your browser
```

---

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/students | Get all students |
| POST | /api/students | Add new student |
| GET | /api/courses | Get all courses |
| POST | /api/courses | Add new course |
| POST | /api/enroll | Enroll student in course |
| GET | /api/enroll/{courseId} | Get students by course |

---

## 👨‍💻 Author

Logamurugan P
📧 logamurugan04@gmail.com   
🐙 [GitHub](https://github.com/Logamurugan12)
