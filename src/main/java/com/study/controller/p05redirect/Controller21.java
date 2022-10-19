package com.study.controller.p05redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("ex21")
public class Controller21 {

    @RequestMapping("sub01")
    public String method1(RedirectAttributes rttr) {
        rttr.addAttribute("name", "captain");
        return null;
    }
}
