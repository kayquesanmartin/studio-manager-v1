package io.github.kayquesanmartin.studiomanager.v1.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.kayquesanmartin.studiomanager.v1.model.AppUser;
import io.github.kayquesanmartin.studiomanager.v1.repository.AppUserRepository;

@RestController
@RequestMapping("/user")
public class AppUserController {

    private AppUserRepository appUserRepository;

    public AppUserController(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @PostMapping
    public AppUser save(@RequestBody AppUser appUser) {
        System.out.println("Usuário salvo: " + appUser);

        var id = UUID.randomUUID().toString();
        appUser.setId(id);

        appUserRepository.save(appUser);
        return appUser;
    }

    @GetMapping("/{id}")
    public AppUser getById(@PathVariable("id") String id) {
        return appUserRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<AppUser> getByName(@RequestParam("fullName") String fullName) {
        return appUserRepository.findByFullName(fullName);
    }

    @PutMapping("/{id}")
    public AppUser updateById(@PathVariable("id") String id, @RequestBody AppUser appUser) {
        appUser.setId(id);
        appUserRepository.save(appUser);
        return appUser;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String id) {
        appUserRepository.deleteById(id);
    }

}
