package com.example.Course.Registration.System.Repository;

import com.example.Course.Registration.System.Model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistry_Repo extends JpaRepository<CourseRegistry,Integer> {
}
