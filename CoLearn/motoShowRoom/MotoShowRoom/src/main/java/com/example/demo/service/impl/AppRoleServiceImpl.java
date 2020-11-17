package com.example.demo.service.impl;

import com.example.demo.entity.AppRole;
import com.example.demo.repository.AppRoleRepository;
import com.example.demo.service.AppRoleService;
import com.example.demo.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AppRoleServiceImpl implements AppRoleService {
    @Autowired
    AppRoleRepository appRoleRepository ;

    @Override
    public List<AppRole> getAllUser() {
        return null;
    }

    @Override
    public void save(AppRole user) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Optional<AppRole> findById(Long id) {
        return appRoleRepository.findById(id);
    }

    public Object approle2(Long id){
        return appRoleRepository.findById(id) ;
    }
}
