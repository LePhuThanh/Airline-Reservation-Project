package com.example.hclproject.controllers;

import com.example.hclproject.entities.User;
import com.example.hclproject.handlers.CustomException;
import com.example.hclproject.payloads.responses.DataResponse;
import com.example.hclproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public DataResponse getAllUser() {
        List<User> userList = userService.getAllUser();
        if (userList.size() == 0) {
            throw new CustomException("404", "User not found");
        }
        return new DataResponse("200", userList);
    }
}
