package vn.vuduy.laptopshop.service;

import org.springframework.stereotype.Service;

import vn.vuduy.laptopshop.domain.User;
import vn.vuduy.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    // constructor
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User handleSaveUser(User user) {
        return this.userRepository.save(user);
    }
}
