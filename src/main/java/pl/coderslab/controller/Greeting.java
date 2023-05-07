package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greeting {
    @GetMapping(path = "/hello/{firstName}/{lastName}")
    @ResponseBody
    String sayHello(@PathVariable String firstName, @PathVariable String lastName){
        return "Witaj " + firstName + " " + lastName;
    }
}
