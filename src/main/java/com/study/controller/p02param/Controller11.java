package com.study.controller.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex11")
public class Controller11 {

    @GetMapping("sub01")
    public void method1(@RequestParam("address") String abc) {
        System.out.println(abc);
    }

    @GetMapping("sub02")
    public void method2(@RequestParam String address) {
        System.out.println(address);
    }

    @GetMapping("sub03")
    public void method3(String abc) {
        System.out.println(abc);
    }

    @GetMapping("sub04")
    public void method4(String city, int age, String name) {
        System.out.println(city);
        System.out.println(age);
        System.out.println(name);
    }
}
