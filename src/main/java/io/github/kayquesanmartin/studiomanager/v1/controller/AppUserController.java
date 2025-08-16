package io.github.kayquesanmartin.studiomanager.v1.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.kayquesanmartin.studiomanager.v1.model.AppUser;

@RestController
@RequestMapping("/app-user")
public class AppUserController {

    @PostMapping
    public AppUser save(@RequestBody AppUser appUser) {
        System.out.println("Usuário salvo: " + appUser);

        return appUser;
    }

}
