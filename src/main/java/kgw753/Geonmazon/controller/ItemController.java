package kgw753.Geonmazon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

    @GetMapping("/items")
    public String itemList(){
        return "/items/itemList";
    }

    @GetMapping("/cartList")
    public String cartList(){
        return "/items/cartList";
    }
}
