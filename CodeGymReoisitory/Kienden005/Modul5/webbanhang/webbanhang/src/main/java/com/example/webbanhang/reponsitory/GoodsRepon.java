package com.example.webbanhang.reponsitory;

import com.example.webbanhang.model.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GoodsRepon extends JpaRepository<Goods,Integer> {
    @Query("select c from Goods c where c.goodName like %?1%" +
            "or c.category.name like %?1%")
     List<Goods> findAll(String keyword);
}
