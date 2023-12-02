package com.example.hyngry.service;

import com.example.hyngry.DTO.UserDTO;
import com.example.hyngry.entity.User;
import com.example.hyngry.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByName(String Name ){
        return userRepository.findByName(Name);
    }

    @Override
    public User save(UserDTO userDTO) {
        User user = new User(userDTO.getName(), userDTO.getLastName(),
                userDTO.getEmail(), userDTO.getPassword(), userDTO.getAddress());
        return userRepository.save(user);
    }
}
