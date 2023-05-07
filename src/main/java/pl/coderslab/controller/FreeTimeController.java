package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;


@Controller
public class FreeTimeController {
    @GetMapping(path = "/free-time", produces = "text/plain; charset=UTF-8")
    @ResponseBody
    public String avaliable(){
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        DayOfWeek day = date.getDayOfWeek();

        LocalTime startWork = LocalTime.of(9,00);
        LocalTime endWork = LocalTime.of(17,00);

        if (DayOfWeek.SATURDAY.equals(day) || DayOfWeek.SUNDAY.equals(day)){
            return "Wolne";
        } else if (time.isBefore(endWork) && time.isAfter(startWork)) {
            return "Pracuje, nie dzwoń.";
        } else {
            return "Po Pracy";
        }
    }
}
