package com.bookkeeper.controller;

import com.bookkeeper.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

/*    @GetMapping("/user/new")
    public String createForm(Model model) {
        model.addAttribute("form", new SignUpForm());

        return ""
    }*/
}
