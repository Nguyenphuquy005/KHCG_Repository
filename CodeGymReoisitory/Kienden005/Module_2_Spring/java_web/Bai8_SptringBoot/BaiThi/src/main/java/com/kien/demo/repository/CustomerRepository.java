package com.kien.demo.repository;

import com.kien.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Product, Long> {

    @Query("select c from Product c")
    List<Product> findAll();
    Page<Product> findAllByNameContaining(String name, Pageable pageable);
}
