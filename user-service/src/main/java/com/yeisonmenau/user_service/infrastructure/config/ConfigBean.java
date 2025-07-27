package com.yeisonmenau.user_service.infrastructure.config;

import com.yeisonmenau.user_service.application.service.UserService;
import com.yeisonmenau.user_service.domain.out.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {
    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }
}
