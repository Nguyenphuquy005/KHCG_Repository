package com.example.demo.service;

import com.example.demo.entity.AppUser;

import java.util.List;
import java.util.Optional;

public interface Service<T> {
    List<T> getAllUser();

    void save(T user);

    void delete(Long id);

    Optional<T> findById(Long id);
}
