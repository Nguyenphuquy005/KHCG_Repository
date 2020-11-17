package com.example.webbanhang.service;

import com.example.webbanhang.model.Bill;
import com.example.webbanhang.model.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> findAll(String keyword);
}
