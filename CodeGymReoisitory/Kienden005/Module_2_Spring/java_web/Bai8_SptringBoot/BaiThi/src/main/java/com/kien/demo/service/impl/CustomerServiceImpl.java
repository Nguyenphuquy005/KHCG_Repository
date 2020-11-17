package com.kien.demo.service.impl;

import com.kien.demo.model.Product;
import com.kien.demo.repository.CustomerRepository;
import com.kien.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
  @Autowired private  CustomerRepository customerRepository ;
    @Override
    public List<Product> findAll() {

      return customerRepository.findAll();
    }



    @Override
    public Product findById(long id) {
        return customerRepository.findById(id).orElse(null);
    }


    @Override
    public void save(Product customer) {
     customerRepository.save(customer) ;
    }

    @Override
    public void delete(Product customer) {
    customerRepository.delete(customer);
    }


  @Override
  public Page<Product> findAllByNameContaining(String name, Pageable pageable) {
    return customerRepository.findAllByNameContaining(name,pageable);
  }
  @Override
  public Page<Product> getAllCustomers(Pageable pageable) {
    return customerRepository.findAll(pageable);
  }
}
