package com.thoughtworks.gtb.basicquiz.api;

import com.thoughtworks.gtb.basicquiz.domain.User;
import com.thoughtworks.gtb.basicquiz.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User getUser(@PathVariable long id) {
        return userService.getUserById(id);
    }
}
