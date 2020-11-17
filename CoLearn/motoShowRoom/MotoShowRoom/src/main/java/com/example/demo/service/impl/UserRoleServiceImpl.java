package com.example.demo.service.impl;

import com.example.demo.entity.AppRole;
import com.example.demo.entity.AppUser;
import com.example.demo.entity.UserRole;
import com.example.demo.repository.UserRoleRepository;
import com.example.demo.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    UserRoleRepository userRoleRepository ;

    @Override
    public List<UserRole> getAllUser() {
        return null;
    }

    @Override
    public void save(UserRole user) {

            userRoleRepository.save(user);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Optional<UserRole> findById(Long id) {
        return userRoleRepository.findById(id) ;
    }
}
