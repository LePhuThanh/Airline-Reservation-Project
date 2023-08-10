package com.example.hclproject.services;

import com.example.hclproject.entities.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    List<User> getAllUser();
}
