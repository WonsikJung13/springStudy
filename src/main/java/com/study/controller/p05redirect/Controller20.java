package com.study.controller.p05redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex20")
public class Controller20 {

    @RequestMapping("sub01")
    public String method1() {
        return "redirect: /ex20/sub02?name=donald";
    }

    @RequestMapping("sub02")
    public String method2(String name) {
        System.out.println("리다이렉트 확인");
        System.out.println(name);
        return null;
    }

    @RequestMapping("sub03")
    public String method3() {
        return "redirect: /ex20/sub04?address=Seoul&age=30";
    }

    @RequestMapping("sub04")
    public String method4(String address, int age) {
        System.out.println(address);
        System.out.println(age);
        return null;
    }
}

