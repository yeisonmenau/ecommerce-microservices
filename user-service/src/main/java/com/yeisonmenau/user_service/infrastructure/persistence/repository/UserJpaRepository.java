package com.yeisonmenau.user_service.infrastructure.persistence.repository;

import com.yeisonmenau.user_service.infrastructure.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
}
