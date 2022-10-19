package com.study.controller.p05redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex19")
public class Controller19 {

    @RequestMapping("sub01")
    public String method3() {
        return "redirect:sub02";
    }

    @RequestMapping("sub05")
    public String method5() {
        System.out.println("메소드 5555");
        return "redirect:sub06";
    }

    @RequestMapping("sub09")
    public String method9() {
        return "redirect:/ex19/sub10";
    }

    @RequestMapping("sub11")
    public String method10() {
        return "redirect:/ex19/sub12";
    }

}
