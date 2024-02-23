package com.bookkeeper.controller;

import com.bookkeeper.domain.user.User;
import com.bookkeeper.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping("/users/new")
    public String createForm(Model model) {
        model.addAttribute("form", new SignUpForm());

        return "users/signUpForm";
    }

    @PostMapping("/users/new")
    public String create(@ModelAttribute("form") @Validated SignUpForm form, BindingResult result) {
        User user = new User();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        user.setEmail(form.getEmail());
        user.setPassword(form.getPassword());
        user.setName(form.getName());
        user.setBirthday(form.getBirthdate());
        user.setGender(form.getGender());
        user.setReg_dt(LocalDateTime.now());

        userService.signupUser(user);
        return "redirect:/";
    }
}
