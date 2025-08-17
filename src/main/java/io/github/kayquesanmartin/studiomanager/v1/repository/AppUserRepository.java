package io.github.kayquesanmartin.studiomanager.v1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.kayquesanmartin.studiomanager.v1.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    List<AppUser> findByFullName(String fullName);
}
