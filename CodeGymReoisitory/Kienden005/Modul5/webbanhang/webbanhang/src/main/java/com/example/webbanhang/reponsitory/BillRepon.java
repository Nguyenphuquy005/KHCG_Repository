package com.example.webbanhang.reponsitory;

import com.example.webbanhang.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BillRepon extends JpaRepository<Bill,Integer> {
}
