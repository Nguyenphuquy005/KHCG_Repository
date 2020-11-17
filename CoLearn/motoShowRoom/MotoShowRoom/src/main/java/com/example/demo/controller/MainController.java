package com.example.demo.controller;


import com.example.demo.checkUser.CheckUser;
import com.example.demo.entity.AppRole;
import com.example.demo.entity.AppUser;
import com.example.demo.entity.UserRole;
import com.example.demo.service.impl.AppRoleServiceImpl;
import com.example.demo.service.impl.UserRoleServiceImpl;
import com.example.demo.service.impl.AppUserServiceImpl;
import com.example.demo.utils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.Optional;

@Controller
public class MainController {

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcomePage(Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is welcome page!");
        return "welcomePage";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(Model model, Principal principal) {

        User loginedUser = (User) ((Authentication) principal).getPrincipal();

        String userInfo = WebUtils.toString(loginedUser);
        model.addAttribute("userInfo", userInfo);

        return "adminPage";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {

        return "loginPage";
    }

    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "logoutSuccessfulPage";
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo(Model model, Principal principal) {

        // Sau khi user login thanh cong se co principal
        String userName = principal.getName();

        System.out.println("User Name: " + userName);

        User loginedUser = (User) ((Authentication) principal).getPrincipal();

        String userInfo = WebUtils.toString(loginedUser);
        model.addAttribute("userInfo", userInfo);
        model.addAttribute("user",appUserService.findUserByUserName(userName));
        System.out.println(appUserService.findUserByUserName(userName));
        return "userInfoPage";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(Model model, Principal principal) {

        if (principal != null) {
            User loginedUser = (User) ((Authentication) principal).getPrincipal();

            String userInfo = WebUtils.toString(loginedUser);

            model.addAttribute("userInfo", userInfo);

            String message = "Hi " + principal.getName() //
                    + "<br> You do not have permission to access this page!";
            model.addAttribute("message", message);

        }

        return "403Page";
    }
    @Autowired
    AppUserServiceImpl appUserService ;
    @Autowired
    UserRoleServiceImpl userRoleService ;
    @Autowired
    AppRoleServiceImpl appRoleService ;
    @RequestMapping(value = ("/registration") ,method = RequestMethod.GET)
    public String getregistrtion(Model model){
        model.addAttribute("account", new AppUser()) ;
        return "registration" ;
    }
    @RequestMapping(value = ("/registrationAdmin") ,method = RequestMethod.GET)
    public String getregistrtionAdmin(Model model){
        model.addAttribute("account", new AppUser()) ;
        return "registrationAdmin" ;
    }
    @RequestMapping(value = ("/setAccount") , method = RequestMethod.POST)
    public String SetAccount(@RequestParam(name = "testPassword") String testPassword , AppUser user ,
                              Model model){
        if (appUserService.findAllByUserName(user.getUserName()).size() != 0){
            model.addAttribute("account", new AppUser()) ;
            model.addAttribute("userError", "This account already exists");
            return ("registration");
        }
        if ( testPassword.equals(user.getEncrytedPassword())){

            if (!CheckUser.checkUserName(user.getUserName())){
                model.addAttribute("account", new AppUser()) ;
                model.addAttribute("userError", "User Bigger 6 Character");
                return ("registration");
            }
            if (!CheckUser.checkPassWord(user.getEncrytedPassword())){
                model.addAttribute("account", new AppUser()) ;
                model.addAttribute("passwordError", "Password 6 Character and one uppercase, one number");
                return ("registration");
            }

            PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encodedPassword = passwordEncoder.encode(user.getEncrytedPassword());
            System.out.print(encodedPassword);
            user.setEncrytedPassword(encodedPassword);
            user.setEnabled(true);
            appUserService.saveUser(user);
            AppRole appRole = new AppRole();
            appRole.setRoleId((long) 2);
            appRole.getRoleName("ROLE_USER") ;
            UserRole account = new UserRole() ;
            account.setAppUser(user);
            account.setAppRole(appRole);
            userRoleService.save(account);
            model.addAttribute("message", "you have account");
            return ("welcomePage");
        }else {
            model.addAttribute("account", new AppUser()) ;
            model.addAttribute("passwordError", "password does not match");
            return ("registration");
        }
    }
    @RequestMapping(value = ("/setAdmin") , method = RequestMethod.POST)
    public String SetAdmin(@RequestParam(name = "testPassword") String testPassword , AppUser user ,
                              Model model){
        if (appUserService.findAllByUserName(user.getUserName()).size() != 0){
            model.addAttribute("account", new AppUser()) ;
            model.addAttribute("userError", "This account already exists");
            return ("registration");
        }
        if ( testPassword.equals(user.getEncrytedPassword())){

            if (!CheckUser.checkUserName(user.getUserName())){
                model.addAttribute("account", new AppUser()) ;
                model.addAttribute("userError", "User Bigger 6 Character");
                return ("registration");
            }
            if (!CheckUser.checkPassWord(user.getEncrytedPassword())){
                model.addAttribute("account", new AppUser()) ;
                model.addAttribute("passwordError", "Password 6 Character and one uppercase, one number");
                return ("registration");
            }

            PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encodedPassword = passwordEncoder.encode(user.getEncrytedPassword());
            System.out.print(encodedPassword);
            user.setEncrytedPassword(encodedPassword);
            user.setEnabled(true);
            appUserService.saveUser(user);

            AppRole appRole1 = new AppRole();
            appRole1.setRoleId((long) 1);
            appRole1.getRoleName("ROLE_ADMIN") ;
            UserRole account1 = new UserRole() ;
            account1.setAppUser(user);
            account1.setAppRole(appRole1);
            userRoleService.save(account1);



            AppRole appRole = new AppRole();
            appRole.setRoleId((long) 2);
            appRole.getRoleName("ROLE_USER") ;
            UserRole account = new UserRole() ;
            account.setAppUser(user);
            account.setAppRole(appRole);
            userRoleService.save(account);



            model.addAttribute("message", "you have account");
            return ("welcomePage");
        }else {
            model.addAttribute("account", new AppUser()) ;
            model.addAttribute("passwordError", "password does not match");
            return ("registration");
        }
    }

    @RequestMapping(value = "editUser", method = RequestMethod.POST)
    public String editUser(AppUser user ,Model model){
        System.out.println(user.getUserId());
        System.out.println(user.getUserName());
        System.out.println(user.getEncrytedPassword());
        if (!CheckUser.checkPassWord(user.getEncrytedPassword())){
            model.addAttribute("passwordError", "Password 6 Character and one uppercase, one number");
            return  "redirect:/userInfo" ;
        }else {
            PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encodedPassword = passwordEncoder.encode(user.getEncrytedPassword());
            System.out.print(encodedPassword);
            user.setEncrytedPassword(encodedPassword);
            appUserService.saveUser(user);
            return  "redirect:/userInfo" ;
        }

    }
}
