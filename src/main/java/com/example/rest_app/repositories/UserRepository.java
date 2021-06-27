package com.example.rest_app.repositories;

import com.example.rest_app.modelss.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
