package com.study.controller.p04attribute;

import com.study.domain.JavaBean01;
import com.study.domain.JavaBean02;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex18")
public class Controller18 {

    @RequestMapping("sub01")
    public void method01(@ModelAttribute("bean")JavaBean01 b) {

    }

    @RequestMapping("sub02")
    public void method02(@ModelAttribute("bean") JavaBean02 b2) {

    }
}
