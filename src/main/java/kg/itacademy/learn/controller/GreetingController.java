package kg.itacademy.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/{lastname}")
    public String getGreeting(Model model, @RequestParam(name = "name") String name,
                              @PathVariable(name = "lastname") String lastname){
        model.addAttribute("firstname", name);
        model.addAttribute("lastname", lastname);
        return "greeting";
    }
}
