package com.example.demo.seervice.impl;

import com.example.demo.model.Categorite;
import com.example.demo.repository.ListCagoriteRepository;
import com.example.demo.seervice.ListCagoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public  class CateGoriteServiceImpl implements ListCagoriteService {
    @Autowired
    ListCagoriteRepository listCagoriteRepository ;
    @Override
    public List<Categorite> findAll() {
        return listCagoriteRepository.findAll()    ;
    }




}
