package com.example.webbanhang.service.Imp;

import com.example.webbanhang.model.Bill;
import com.example.webbanhang.reponsitory.BillRepon;
import com.example.webbanhang.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillServiceIpm implements BillService {
    @Autowired
    BillRepon billRepon;
    @Override
    public List<Bill> findAll() {
        return billRepon.findAll();
    }

}
