package com.example.demo.checkUser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckUser {
    public static boolean  checkUserName(String userName){
        if (userName.length() < 6){
            return  false ;
        }else {
            return true ;
        }
    }
    public static Boolean checkPassWord(String passWord){
        String pattern  = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" ;
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(passWord);
        if (m.find()){
            return true;
        }else {
            return false ;
        }
    }


}
