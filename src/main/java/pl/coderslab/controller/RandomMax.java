package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomMax {
    @GetMapping("/random/{min:^\\d+$}/{max:^\\d+$}")
    @ResponseBody
    String showRandom(@PathVariable int min, @PathVariable int max){
        Random random = new Random();
        int randomInt = random.nextInt(max-min+1)+min;
        return "Użytkownik podał wartość max. Wylosowano liczbę: "+randomInt;
    }
}
