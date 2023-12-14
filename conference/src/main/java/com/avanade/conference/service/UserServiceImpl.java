package com.avanade.conference.service;

import com.avanade.conference.model.User;
import com.avanade.conference.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }

}
