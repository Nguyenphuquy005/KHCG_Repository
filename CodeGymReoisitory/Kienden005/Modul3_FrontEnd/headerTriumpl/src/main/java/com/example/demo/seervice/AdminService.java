package com.example.demo.seervice;

import com.example.demo.model.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> findAll() ;
    List<Admin> findAllByUserAndPassWord(String u , String p) ;
}
