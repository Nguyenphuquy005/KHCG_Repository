package com.example.demo.repository;

import com.example.demo.model.Categorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListCagoriteRepository extends JpaRepository<Categorite,Long> {
}
