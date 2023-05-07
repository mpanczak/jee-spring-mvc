package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("/first")
public class DateController {
    @GetMapping("/form")
    public String hello() {
        return "/form.jsp";
    }

    @PostMapping(path = "/form")
    @ResponseBody
    String showDate(@RequestParam String date) {
        LocalDate localDate = LocalDate.parse(date);
        return localDate.toString();
//        return date.toString();
    }
}
