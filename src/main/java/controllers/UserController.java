package controllers;

import Entities.User;
import Services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String listUsers(Model model) {
        model.addAttribute("user", new User()); // necessário para th:field
        model.addAttribute("users", userService.findAll());
        return "users"; // Thymeleaf procura templates/users.html
    }

    @PostMapping
    public String createUser(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:/users"; // volta para a lista
    }
}

