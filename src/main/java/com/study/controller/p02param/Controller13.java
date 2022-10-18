package com.study.controller.p02param;

import com.study.domain.JavaBean01;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex13")
public class Controller13 {

    @RequestMapping("sub01")
    public void method(JavaBean01 bean1) {
        String name = bean1.getName();
        String address = bean1.getAddress();

        System.out.println(name);
        System.out.println(address);

    }
}
