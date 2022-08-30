package com.bridgelabz.userregistrationloginapp.service;

import com.bridgelabz.userregistrationloginapp.dto.UserRegistrationDto;
import com.bridgelabz.userregistrationloginapp.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
