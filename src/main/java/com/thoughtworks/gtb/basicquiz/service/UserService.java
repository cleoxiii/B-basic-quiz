package com.thoughtworks.gtb.basicquiz.service;

import com.thoughtworks.gtb.basicquiz.domain.User;
import com.thoughtworks.gtb.basicquiz.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(long id) {
        return userRepository.getUserById(id);
    }

    public User addUser(User user) {
        // GTB: 通常生成 id 的职责是 Repository 的，但也有例外
        user.setId(userRepository.count() + 1);
        return userRepository.addUser(user);
    }
}
