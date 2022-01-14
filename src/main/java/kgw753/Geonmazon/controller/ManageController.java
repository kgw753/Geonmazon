package kgw753.Geonmazon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManageController {

    @GetMapping("/manage")
    public String itemManage(){
        return "/manage/itemManage";
    }
}
