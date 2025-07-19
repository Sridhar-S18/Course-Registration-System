package com.example.Course.Registration.System.Controller;


import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistry;
import com.example.Course.Registration.System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://127.0.0.1:5500"})
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }

    @PostMapping("/course/register")
    public String enrollCourses(@RequestParam("name") String name,@RequestParam("emailId") String emailId,@RequestParam("courseName") String courseName){
        courseService.enrollCourses(name,emailId,courseName);
        return "Congratulations! " +name+ " Enrollment successful for " +courseName;
    }
}
