package com.example.demo.repository;

import com.example.demo.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AppUserRopository extends JpaRepository<AppUser,Long> {
    List<AppUser> findAllByUserName(String user_name);

    Optional<AppUser> findByUserName(String user_name);
}
