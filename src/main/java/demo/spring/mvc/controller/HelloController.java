package demo.spring.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by raist on 2016/5/22.
 *
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/mvc")
    public String helloMvc() {
        return "welcome";
    }
}
