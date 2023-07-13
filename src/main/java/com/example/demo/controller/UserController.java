package com.example.demo.controller;

import com.example.demo.controller.request.CreateUserRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    @PostMapping()
    public String createUser(@Valid @RequestBody CreateUserRequest request) {
        return "user created";
    }

}
