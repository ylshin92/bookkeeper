package com.bookkeeper.service;

import com.bookkeeper.domain.user.User;
import com.bookkeeper.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void signupUser(User user) {
        userRepository.signup(user);
    }
}
