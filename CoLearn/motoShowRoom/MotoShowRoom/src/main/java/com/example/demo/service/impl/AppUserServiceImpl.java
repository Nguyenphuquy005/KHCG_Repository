package com.example.demo.service.impl;

import com.example.demo.entity.AppUser;
import com.example.demo.repository.AppUserRopository;
import com.example.demo.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
 @Service
public class AppUserServiceImpl  implements AppUserService {
    @Autowired
    AppUserRopository appUserRopository ;
    @Override
    public List<AppUser> getAllUser() {
        return null;
    }

    @Override
    public void saveUser(AppUser user) {
         appUserRopository.save(user) ;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public Optional<AppUser> findUserById(Long id) {
        return Optional.empty();
    }

    public List<AppUser> findAllByUserName(String User_Name){
        return appUserRopository.findAllByUserName(User_Name);
    }

     public Optional<AppUser> findUserByUserName(String User_Name) {
         return appUserRopository.findByUserName(User_Name);
     }

}
