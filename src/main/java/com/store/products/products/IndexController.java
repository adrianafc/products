package com.store.products.products;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping ("/index")
    public String sayHello(){
        return "Hello madafackers";
    }
}
