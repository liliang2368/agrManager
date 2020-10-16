package com.ly.agrManader.web.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class argManager {
    @RequestMapping({"", "admin"})
    public String admin( )
    {
        return "admin";
    }
    @RequestMapping("order")
    public String order( )
    {
        return "order";
    }
    @RequestMapping("food")
    public String food( )
    {
        return "food";
    }
}
