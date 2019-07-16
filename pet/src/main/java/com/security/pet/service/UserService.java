package com.security.pet.service;

import com.security.pet.model.User;

public interface UserService 
{
    void save(User user);

    User findByUsername(String username);
}