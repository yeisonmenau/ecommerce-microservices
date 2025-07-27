package com.yeisonmenau.user_service.infrastructure.web.adapter;

import com.yeisonmenau.user_service.domain.model.User;
import com.yeisonmenau.user_service.domain.out.UserRepository;
import com.yeisonmenau.user_service.infrastructure.persistence.entity.UserEntity;
import com.yeisonmenau.user_service.infrastructure.persistence.mapper.UserMapper;
import com.yeisonmenau.user_service.infrastructure.persistence.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class UserAdapter implements UserRepository {

    private final UserJpaRepository userJpaRepository;
    private final UserMapper userMapper;

    @Override
    public List<User> listAllUsers() {
        List<UserEntity> usuariosEntidad =  userJpaRepository.findAll();
        return usuariosEntidad.stream().map(userMapper::toDomain).toList();
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User findUserById(Long userId) {
        return null;
    }
}
