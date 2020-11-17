package com.kien.demo.service;

import com.kien.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Product> findAll();
    Product findById(long id) ;
   void  save(Product customer) ;
   void delete(Product customer) ;
    Page<Product> findAllByNameContaining(String name, Pageable pageable);
    Page<Product> getAllCustomers(Pageable pageable);
}
