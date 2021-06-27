package com.example.rest_app.services.services_impl;

import com.example.rest_app.modelss.User;
import com.example.rest_app.repositories.UserRepository;
import com.example.rest_app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    @Autowired
    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> allUsers = repo.findAll();
        return allUsers;
    }

    @Override
    public User getUser(int id) {
        User user = null;
        Optional<User> optional= repo.findById(id);

        if (optional.isPresent()){
            user = optional.get();
        }
        return user;
    }

    @Override
    public void saveUser(User user) {
        repo.save(user);
    }

    @Override
    public void deleteUser(int id) {
        repo.deleteById(id);
    }
}
