package hiwotab.springboot_04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// controller class is used as intermidate to our model  to the data base
@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHomePage() {

        return "index";
    }

    @RequestMapping("/loadform")
    public String loadFormPage(){
        return "formtemplate";
    }
     @RequestMapping("/processform")
    public String loadFormPage(@RequestParam("login")String login,Model model) {
        model.addAttribute("loginval",login);
        return "confirm";
    }
}
