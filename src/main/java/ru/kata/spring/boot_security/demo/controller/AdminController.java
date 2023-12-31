package ru.kata.spring.boot_security.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.repository.RoleRepository;

@Controller
@RequestMapping("admin")
public class AdminController {

    @GetMapping
    public String index(Model model, @AuthenticationPrincipal User curUser) {
        model.addAttribute("curUser", curUser);
        return "index";
    }
}
