package com.example.demo.service;

import com.example.demo.entity.AppUser;

import java.util.List;
import java.util.Optional;

public interface AppUserService {
    List<AppUser> getAllUser();

    void saveUser(AppUser user);

    void deleteUser(Long id);

    Optional<AppUser> findUserById(Long id);
}
