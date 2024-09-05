package com.sametcan.SpringBootWebApp5;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("calculate")
    public String calculate(int num1,int num2,String operation,Model model){

        int result = 0;

        switch (operation) {
            case "Add":
                result = num1 + num2;
                break;
            case "Subtract":
                result = num1 - num2;
                break;
            case "Multiply":
                result = num1 * num2;
                break;
            case "Divide":
                result = num1 / num2;
                break;
        }
        model.addAttribute("result",result);
        return "result";
    }
}

