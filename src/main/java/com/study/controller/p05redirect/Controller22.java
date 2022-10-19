package com.study.controller.p05redirect;

import com.study.domain.JavaBean03;
import com.study.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("ex22")
public class Controller22 {

    @RequestMapping("sub01")
    public String method1(Model model) {
        return "redirect:/ex22/sub02";
    }

    @RequestMapping("sub02")
    public void method2(Model model) {
        boolean hasName = model.containsAttribute("name");
        System.out.println(hasName);
    }

    @RequestMapping("sub05")
    public String method5(HttpSession session) {
        Student student = new Student();
        student.setStudentNumber("1");
        student.setName("Student Name");
        student.setClassName("JAVA");
        session.setAttribute("student", student);

        return "redirect:/ex22/sub06";
    }

    @RequestMapping("sub06")
    public void method6(HttpSession session) {
        Student student = (Student) session.getAttribute("student");
        System.out.println(student.getStudentNumber());
        System.out.println(student.getClassName());
        System.out.println(student.getName());
    }

    @RequestMapping("sub07")
    public String method7(RedirectAttributes rttr) {
        JavaBean03 javaBean03 = new JavaBean03();
        javaBean03.setScore(100);
        javaBean03.setClassName("JAVA");
        javaBean03.setStudentNumber("13");
        javaBean03.setLocation("Seoul");
        javaBean03.setAvg(50);

        rttr.addFlashAttribute("javaBean03", javaBean03);
        return "redirect:/ex22/sub08";
    }

    @RequestMapping("sub08")
    public void method8(@ModelAttribute("javaBean03") JavaBean03 javaBean03) {
        System.out.println(javaBean03);

    }
}

