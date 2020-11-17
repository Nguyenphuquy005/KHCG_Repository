package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.model.ListMoto;
import com.example.demo.seervice.AdminService;
import com.example.demo.seervice.ListCagoriteService;
import com.example.demo.seervice.ListMotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class AdminController {
@Autowired
    AdminService adminService;
@Autowired
    ListMotoService listMotoService ;
@Autowired
    ListCagoriteService listCagoriteService ;
    @GetMapping("/admin")
    public String setAdmin(){
        return "admin";
    }
    @PostMapping("/adminAction")
    public String setAdminAction(@RequestParam(name = "user") String user
            , @RequestParam(name ="password") String password , Model model){

             List<Admin> list = adminService.findAllByUserAndPassWord(user,password) ;
             if (list.size()==1){
                 return "crud/adminAction";
             }else {
        return "admin";
    }
    }
    @GetMapping("/adminjob")
    public String adminjob( @PageableDefault(value = 3) Pageable pageable , Model model) {
        Page<ListMoto> listMotos ;
                listMotos = listMotoService.findAllListMoto(pageable) ;
         model.addAttribute("listmoto",listMotos) ;
         return "crud/adminJob" ;
    }
    @GetMapping("/addnewmoto")
    public String setAdd(Model model){
        model.addAttribute("newmoto", new ListMoto());
        model.addAttribute("categorite" , listCagoriteService.findAll());
        return "crud/addNewMoto";
    }
    @PostMapping("/addnewmotobike")
    public  String getAdd(@Validated @ModelAttribute("newmoto") ListMoto listMoto , BindingResult bindingResult,
                          Model model){
               if(bindingResult.hasErrors()){
                    model.addAttribute("erName","name is unique");
                    model.addAttribute("erWeight","Weight of Moto is data type double");
                    model.addAttribute("erHourePower","Houre Power of Moto is data type double");
                   model.addAttribute("categorite" , listCagoriteService.findAll());
                   return ("crud/addNewMoto");
               }else {
                   listMotoService.save(listMoto);
                   return "redirect:/adminjob" ;
               }
    }
    @GetMapping("/edit/{id}/motobike")
    public String setEdit(@PathVariable(name = "id") long id , Model model){
         model.addAttribute("update",listMotoService.findById(id));
         return "crud/editMoto";
    }
    @PostMapping("/editmoto")
    public String getEdit(@Validated @ ModelAttribute("update") ListMoto listMoto ,BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("erName","name is unique");
            model.addAttribute("erWeight","Weight of Moto is data type double");
            model.addAttribute("erHourePower","Houre Power of Moto is data type double");
            model.addAttribute("categorite" , listCagoriteService.findAll());
            return "crud/editMoto";
        }else {
            listMotoService.save(listMoto);
            return "redirect:/adminjob" ;
        }
    }
    @GetMapping("/delete/{id}/motobike")
    public String setDelete(@PathVariable(name = "id") long id , Model model){
        model.addAttribute("delete",listMotoService.findById(id));
        return "crud/deleteMoto";
    }
    @PostMapping("/delete")
    public String getDelete(@ModelAttribute(name = "delete") ListMoto listMoto){
        listMotoService.delete(listMoto);
        return "redirect:/adminjob" ;
    }
}
