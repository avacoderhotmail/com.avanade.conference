package com.avanade.conference.repository;

import com.avanade.conference.model.User;

public interface UserRepository {
    User save(User user);
}
