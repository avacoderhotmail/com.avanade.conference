package com.avanade.conference.repository;

import com.avanade.conference.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User save (User user){
        entityManager.persist(user);
        return user;
    }
}
