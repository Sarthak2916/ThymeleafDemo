package thymeleaf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import thymeleaf.demo.model.UserForm;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    @GetMapping("/register")
    public String register(Model model){
        UserForm form= new UserForm();
        model.addAttribute("userForm", form);
        List<String> genders= Arrays.asList("male","female","prefer not to say");
        model.addAttribute("genders", genders);
        return "register-form";
    }

    @GetMapping("/register/save")
    public String register(Model model, @ModelAttribute("userForm") UserForm userForm){
        model.addAttribute("userForm", userForm);
        return "register-success";

    }

}
