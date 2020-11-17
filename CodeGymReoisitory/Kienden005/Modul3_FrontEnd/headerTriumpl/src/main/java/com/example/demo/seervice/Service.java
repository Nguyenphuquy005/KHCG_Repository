package com.example.demo.seervice;

import com.example.demo.repository.ListMotoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface Service<T>  {
    List<T> findAll() ;

}
