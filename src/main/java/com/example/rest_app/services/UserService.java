package com.example.rest_app.services;

import com.example.rest_app.modelss.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();
    public User getUser(int id);
    public void saveUser(User user);
    public void deleteUser(int id);
}
