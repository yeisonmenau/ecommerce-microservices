package com.yeisonmenau.user_service.infrastructure.persistence.mapper;

import com.yeisonmenau.user_service.domain.model.User;
import com.yeisonmenau.user_service.infrastructure.persistence.entity.UserEntity;
import com.yeisonmenau.user_service.infrastructure.web.dto.response.UserResponseDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;

@Component
public class UserMapper {
    public User toDomain (UserEntity userEntity){
        return new User(
                userEntity.getUserId(),
                userEntity.getUsername(),
                userEntity.getEmail(),
                userEntity.getFechaNacimiento()
        );
    }
    public UserEntity toEntity(User user) {
        return new UserEntity(
                null,
                user.getUsername(),
                user.getEmail(),
                user.getFechaNacimiento());
    }
    public UserResponseDTO toResponseDTO(User user) {
        return new UserResponseDTO(
                user.getUserId(),
                user.getUsername(),
                user.getEmail(),
                Period.between(user.getFechaNacimiento(), LocalDate.now()).getYears()
        );
    }

}
