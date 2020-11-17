package com.codegym.tichhopspringsecuritychoblog.repository;

import com.codegym.tichhopspringsecuritychoblog.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Long> {
    Role findByName(String name);
}
