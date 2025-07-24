package com.yeisonmenau.user_service.domain.out;

import com.yeisonmenau.user_service.domain.model.User;

import java.util.List;

public interface UserRepository {
    List<User> listAllUsers();
    User createUser(User user);
    User findUserById(Long userId);
}
