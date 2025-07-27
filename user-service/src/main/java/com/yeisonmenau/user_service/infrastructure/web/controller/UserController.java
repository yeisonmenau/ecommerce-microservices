package com.yeisonmenau.user_service.infrastructure.web.controller;

import com.yeisonmenau.user_service.application.service.UserService;
import com.yeisonmenau.user_service.domain.model.User;
import com.yeisonmenau.user_service.infrastructure.persistence.mapper.UserMapper;
import com.yeisonmenau.user_service.infrastructure.web.dto.response.UserResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    public ResponseEntity<List<UserResponseDTO>> mostrarUsuarios() {
        List<User> usuariosDominio = userService.listAllUsers();
        List<UserResponseDTO> usuariosRespuesta = usuariosDominio.stream()
                .map(userMapper::toResponseDTO)
                .toList();
        return ResponseEntity.ok(usuariosRespuesta);
    }
}
