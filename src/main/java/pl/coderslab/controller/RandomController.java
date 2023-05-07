package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {
    @GetMapping(path = "/show-random", produces = "text/plain; charset=UTF-8")
    @ResponseBody
    public String showRandom(){
        Random random = new Random();
        int number = random.nextInt(100);
        return "Wylosowano liczbę: " + number;
    }
}
