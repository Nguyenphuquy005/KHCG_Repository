package com.example.webbanhang.service.Imp;

import com.example.webbanhang.model.Goods;
import com.example.webbanhang.reponsitory.GoodsRepon;
import com.example.webbanhang.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceIpm implements GoodsService {
    @Autowired
    GoodsRepon goodsRepon;
    @Override
    public List<Goods> findAll(String keyword) {
        if (keyword != null){return goodsRepon.findAll(keyword);}
        return goodsRepon.findAll();
    }
}
