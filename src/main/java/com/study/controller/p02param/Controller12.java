package com.study.controller.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("ex12")
public class Controller12 {
    @RequestMapping("sub01")
    public void method1(HttpServletRequest request, String name, String address, int age, String email, int password) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        System.out.println("method1 일한다");
        System.out.println("name=" + name);
        System.out.println("address=" + address);
        System.out.println("age=" + age);
        System.out.println("email=" + email);
        System.out.println("password=" + password);
    }
}
