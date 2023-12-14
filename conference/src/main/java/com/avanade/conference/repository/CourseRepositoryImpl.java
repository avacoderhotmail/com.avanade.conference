package com.avanade.conference.repository;

import com.avanade.conference.model.Course;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Course save(Course course) {
        entityManager.persist(course);

        return course;
    }

}
