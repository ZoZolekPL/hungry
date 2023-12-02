package com.example.hyngry.service;

import com.example.hyngry.DTO.UserDTO;
import com.example.hyngry.entity.User;

public interface UserService {
    User findByName(String Name);
    User save(UserDTO userDTO);
}
