# SpringBoot-REST-APIs-course-app
This repository contains backened REST APIs for course app built using Springboot. It is CURD application features like create course, delete course, update course, get course by id and get all courses. In this project, currently not used database (not implemented DAO layer). 
Tested using Postman
url-  http://localhost:8080

Endpoints:
1.Get All Courses:
  endpoint- /courses
  method- GET
  
2.Get course by ID
  endpoint- /courses/{courseId}
  method- GET

3.Add Course
  endpoint- /courses
  method- POST

4.Update course
  endpoint- /courses/{courseId}
  method- PUT

5.Delete course
  endpoint- /courses/{courseId}
  method- DELETE
