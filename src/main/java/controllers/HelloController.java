package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

//    @RequestMapping(method = RequestMethod.GET)
//    public String printHello(ModelMap model) {
//        System.out.println("Hello World");
//        model.addAttribute("message", "Hello World!");
//        return "hello";
//    }

    @RequestMapping(method = RequestMethod.GET)
    public String printHello() {
        return "hello";
    }


}

