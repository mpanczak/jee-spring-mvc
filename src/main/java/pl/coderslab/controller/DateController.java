package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
public class DateController {
    @GetMapping("/form")
    public String hello() {
        return "/form.jsp";
    }

    @PostMapping(path = "/form")
    @ResponseBody
    String showDate(@RequestParam int year, @RequestParam int month, @RequestParam int day) {
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.toString();
    }
}
