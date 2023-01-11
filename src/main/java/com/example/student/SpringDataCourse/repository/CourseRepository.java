package com.example.student.SpringDataCourse.repository;

import com.example.student.SpringDataCourse.entity.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
    @Override
    List<Course> findAll();

}
