package com.example.webbanhang.controller;

import com.example.webbanhang.model.Bill;
import com.example.webbanhang.model.Goods;
import com.example.webbanhang.service.BillService;
import com.example.webbanhang.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @GetMapping("/goods-view")
    public ResponseEntity<List<Goods>> findAll(@Param(value = "keyword") String keyword) {
        return ResponseEntity.status(HttpStatus.OK).body(goodsService.findAll(keyword));
    }

}
