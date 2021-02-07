package com.ly.agrManader.web.management.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class argManager {
    @RequestMapping({"", "login"})
    public String admin() {
        return "login";
    }

    @RequestMapping("mean")
    public String order() {
        return "zentao";
    }

    @RequestMapping("food")
    public String food() {
        return "food";
    }

    @RequestMapping("supplier")
    public String supplier() {
        return "supplier";
    }


    @RequestMapping("SalesPrice")
    public String SalesPrice() {
        return "SalesPrice";
    }


}
