package com.referralbuddy.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloReferralBuddy {
    
    @RequestMapping("/")
    public String greet(){
        return "Hello World! Welcome to referral buddy";
    }
}