package com.codegym.tichhopspringsecuritychoblog.repository;

import com.codegym.tichhopspringsecuritychoblog.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByEmail(String email);
}
