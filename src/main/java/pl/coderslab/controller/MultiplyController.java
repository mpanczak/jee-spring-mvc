package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MultiplyController {

    @GetMapping("/multiply")
    public String showMultiplyTable(Model model, @RequestParam(defaultValue= "10") int size) {

        List<List<String>> arrayList = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
            List<String> array = new ArrayList<>();
            for (int j = 1; j <= size; j++) {
                array.add(String.valueOf(i*j));
            }
            arrayList.add(array);
        }
        model.addAttribute("array", arrayList);

        return "multiplyTable";
    }

    @GetMapping("/paramMultiply/{rows}/{cols}")
    public String showMultiplyParam(Model model, @PathVariable int rows, @PathVariable int cols) {
        List<List<String>> arrayList = new ArrayList<>();

        for (int i = 1; i <= rows; i++) {
            List<String> array = new ArrayList<>();
            for (int j = 1; j <= cols; j++) {
                array.add(String.valueOf(i*j));
            }
            arrayList.add(array);
        }
        model.addAttribute("array", arrayList);
        model.addAttribute("rows", rows);
        return "multiplyTableParam";
    }
}
