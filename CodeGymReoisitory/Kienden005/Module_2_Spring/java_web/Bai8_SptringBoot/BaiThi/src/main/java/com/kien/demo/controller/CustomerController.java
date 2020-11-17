package com.kien.demo.controller;

import com.kien.demo.model.Product;
import com.kien.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.data.domain.Pageable ;
import org.springframework.validation.BindingResult;

import java.util.Date;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public ModelAndView index(@PageableDefault(value = 10) Pageable pageable,
                              @RequestParam(name = "name") Optional<String> name, Model model) {
        Page<Product> customers;
        if (name.isPresent()) {
            customers = customerService.findAllByNameContaining(name.get(), pageable);
            model.addAttribute("name", name.get());
        } else {
            customers = customerService.getAllCustomers(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("customer", customers);
        return modelAndView;
    }

    @GetMapping("/customer/create")
    public String setCreate( Model model) {
        model.addAttribute("customer", new Product()) ;
        return "create" ;
    }

    @PostMapping("/customer/addnewcustomer")
    public String getCustomer( @Validated @ModelAttribute(name = "customer") Product customer ,BindingResult bindingResult
                              ) {
    if (bindingResult.hasErrors()){
        return "create" ;
    }
            customer.setId((int) (Math.random() * 100));
            customer.setDay(new Date());
            customerService.save(customer);
            return "redirect:/";


    }

    @GetMapping("/customer/{id}/edit")
    public String setEdit(@PathVariable(name = "id") int id, Model model ) {
        model.addAttribute("editcustomer", customerService.findById(id));
        return "edit";
    }

    @PostMapping("/customer/edit")
    public String getEdit( @Validated @ModelAttribute("editcustomer") Product customer,
            BindingResult bindingResult, Model model ,
                           RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()){

            model.addAttribute("editcustomer", customer);
            return "edit" ;
        }else {
            customer.setDay(new Date());
            customerService.save(customer);

        }
        return "redirect:/";

    }

    @GetMapping("/customer/{id}/delete")
    public String setDelete(@PathVariable(name = "id") int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "delete";

    }

    @PostMapping("/customer/delete")
    public String getDelete(Product customer, RedirectAttributes redirectAttributes) {
        customerService.delete(customer);
//        redirectAttributes.addFlashAttribute("success", "Delete");
        return "redirect:/";
    }


    @GetMapping("/customer/{id}/view")
    public String setview(@PathVariable(name = "id") int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "view";
    }

}
