package com.example.webbanhang.controller;

import com.example.webbanhang.model.Bill;
import com.example.webbanhang.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;
import java.util.List;



@RestController
@CrossOrigin(origins = "*")
public class BillController {
    @Configuration
    static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        public void configure(WebSecurity web) throws Exception {
            web.ignoring().antMatchers("/**");
        }
    }
    @Autowired
    BillService billService;
    @Autowired
    EntityManager entityManager;

    @GetMapping("/bill-view")
    public ResponseEntity<List<Bill>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(billService.findAll());
    }

}

