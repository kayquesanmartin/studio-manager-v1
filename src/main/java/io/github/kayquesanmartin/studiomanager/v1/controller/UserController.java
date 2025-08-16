package io.github.kayquesanmartin.studiomanager.v1.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.kayquesanmartin.studiomanager.v1.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public User save(@RequestBody User user) {
        System.out.println("Usuário salvo: " + user);

        return user;
    }

}
