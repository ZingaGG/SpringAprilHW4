package ru.gb.springSem4.SpringAprilHW4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.springSem4.SpringAprilHW4.model.User;
import ru.gb.springSem4.SpringAprilHW4.repository.UserRepository;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/users")
    public String getUsers(Model model){
        model.addAttribute("users", userRepository.getAllUsers());
        return "users";
    }

    @GetMapping("/addUser")
    public String addUser(){
        return "addUser";
    }

    @PostMapping("/addUser")
    public String addUser(Model model, User user){
        userRepository.addUser(user);
        model.addAttribute("users", userRepository.getAllUsers());
        return "users";
    }
}

