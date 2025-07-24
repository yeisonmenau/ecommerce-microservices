package com.yeisonmenau.user_service.application.usecase;

import com.yeisonmenau.user_service.domain.model.User;

import java.util.List;

public interface UserUseCase {
    List<User> listAllUsers();
    User createUser(User user);
    User findUserById(Long userId);
}
