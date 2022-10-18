package com.study.controller.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("ex08")
public class Controller08 {
    @GetMapping("sub01")
    public void method1() {
        System.out.println("메소드 1~~~~~~");
    }

    @GetMapping("sub02")
    public void method2(HttpServletRequest httpServletRequest) {

        String address = httpServletRequest.getParameter("address");

        System.out.println(address);
    }

    @GetMapping("sub05")
    public void method5(@RequestParam("name") String a
            , @RequestParam("address") String b) {
        System.out.println("name: " + a + " " + "address: " + b);
    }

    @GetMapping("sub06")
    public void method6(@RequestParam("q") String a,
                        @RequestParam("age") String b) {
        System.out.println("city: " + a + " " + "age: " + b);
    }

    @GetMapping("sub08")
    public void method8(@RequestParam("num1") int num1,
                        @RequestParam("num2") int num2) {
        System.out.println("num1 + num2 = " + (num1 + num2));
    }

    @GetMapping("sub09")
    public void method10(@RequestParam(name = "city", required = false) String a) {
        System.out.println(a);
    }

    @GetMapping("sub10")
    public void method6(@RequestParam(value = "address", defaultValue = "seoul") String address) {
        System.out.println(address);
    }


}
