package com.lajand.tfaktura;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProvideInvoice {

    @RequestMapping("/")
    @ResponseBody
    public String getInvoice() {
        return "Hello world";
    }
}
