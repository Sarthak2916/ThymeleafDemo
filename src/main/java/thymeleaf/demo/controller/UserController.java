package thymeleaf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import thymeleaf.demo.model.User;

import java.util.List;

@Controller
public class UserController {

    @GetMapping("variable-expression")
    public String variableExpression(Model model){
        User user= new User("sarthak", "sarthak123@gmail.com", "ADMIN", "male");
        model.addAttribute("user",user);
        return "variable-expression";
    }

    @GetMapping("message-expression")
    public String messageExpression(){
        return "message-expression";
    }

    @GetMapping("link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id",1);
        return "link-expression";
    }

    @GetMapping("fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }

    @GetMapping("/users")
    public String users(Model model){
        List<User> users= List.of(new User("admin"," admin@xyz.com","admin","gmail"),
                new User("sarthak"," sarthak@xyz.com","CEO","male"),
                new User("Rei"," Rei@xyz.com","CTO","female"));
        model.addAttribute("users", users);
        return "users";
    }
}
