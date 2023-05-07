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
        StringBuilder stringBuilder = new StringBuilder();
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
}
