package com.study.controller.p04attribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("ex16")
public class Controller16 {

    @RequestMapping("sub01")
    public void method(HttpServletRequest req) {
        req.setAttribute("myName", "Park Jisung");
    }
}
