package com.yeisonmenau.user_service.application.service;

import com.yeisonmenau.user_service.application.usecase.UserUseCase;
import com.yeisonmenau.user_service.domain.model.User;
import com.yeisonmenau.user_service.domain.out.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class UserService implements UserUseCase {
    private final UserRepository userRepository;

    @Override
    public List<User> listAllUsers() {
        return userRepository.listAllUsers();
    }

    @Override
    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    @Override
    public User findUserById(Long userId) {
        return userRepository.findUserById(userId);
    }
}
