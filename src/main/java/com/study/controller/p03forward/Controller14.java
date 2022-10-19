package com.study.controller.p03forward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("ex14")
public class Controller14 {

    @RequestMapping("sub01")
    public void method1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("메소드 1번 일함");
        String path = "/WEB-INF/views/ex14/sub01.jsp";
        req.getRequestDispatcher(path).forward(req, res);
    }

    @RequestMapping("sub02")
    public String method2() {
        return "sub04";
    }

    @RequestMapping("sub03")
    public String method3() {
        return "ex14/sub05";
    }
}
