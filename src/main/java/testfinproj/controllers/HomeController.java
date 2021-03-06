package testfinproj.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import testfinproj.entities.forLoging.User;

@Controller
public class HomeController {
    @GetMapping(value = {"/", "/home"})
    public ModelAndView home(ModelAndView modelAndView){
        modelAndView.setViewName("home");
        return modelAndView;
    }
    @GetMapping(value = {"/hello"})
    public ModelAndView hello(ModelAndView modelAndView){
        modelAndView.setViewName("hello");
        return modelAndView;
    }

//    @GetMapping(value = {"/qweee"})
//    public String qwe(Model model){
//        int a=5;
//        int b=a+4;
//        return "qwe";
//    }

}
