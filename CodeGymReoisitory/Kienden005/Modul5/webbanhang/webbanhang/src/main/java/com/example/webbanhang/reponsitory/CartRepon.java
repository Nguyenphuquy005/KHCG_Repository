package com.example.webbanhang.reponsitory;

import com.example.webbanhang.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepon extends JpaRepository<Cart,Integer> {
}
