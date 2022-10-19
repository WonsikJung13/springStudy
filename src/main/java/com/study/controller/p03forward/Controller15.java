package com.study.controller.p03forward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("ex15")
public class Controller15 {

    @RequestMapping("sub01")
    public void method1() {
        System.out.println("메소드 1번 일함!!");
    }

    @RequestMapping("sub02")
    public void method2() {
        System.out.println("메소드 2번!");
    }

    @RequestMapping("sub03")
    public String method3() {

        return null;
    }

    @RequestMapping("sub04")
    public String method4() {
        System.out.println("sub04 일했다");

        return null;
    }

//    @RequestMapping("sub06")
//    public String method5() {
//        return "sub061";
//    }
//
//    @RequestMapping("sub06")
//    public String method6() {
//        return "sub06";
//    }

    @RequestMapping("sub07")
    public String method7(String address) {
        if (address != null) {
            return "sub07";
        }

        return "sub071";
    }
}
