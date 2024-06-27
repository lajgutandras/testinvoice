package com.lajand;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProvideNumberService {

    @RequestMapping("/")
    @ResponseBody
    public String getInvoice() {
        return "Hello number 3_git";
    }
}


