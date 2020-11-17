package com.example.webbanhang.reponsitory;

import com.example.webbanhang.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepon extends JpaRepository<User,Integer> {
}
