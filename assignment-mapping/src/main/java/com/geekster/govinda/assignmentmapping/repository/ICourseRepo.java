package com.geekster.govinda.assignmentmapping.repository;

import com.geekster.govinda.assignmentmapping.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ICourseRepo extends JpaRepository<Course,Long> {
}
