package com.proiect.Coffee_Shop.service;

import com.proiect.Coffee_Shop.dto.UserDto;
import com.proiect.Coffee_Shop.module.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    boolean checkUser(UserDto user);
}
