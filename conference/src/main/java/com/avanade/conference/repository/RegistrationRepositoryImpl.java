package com.avanade.conference.repository;

import com.avanade.conference.model.Registration;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Registration save(Registration registration){
        entityManager.persist(registration);
        return registration;
    }
}
