package com.example.demo.service;

import com.example.demo.dto.Users;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final UserService userService;
    private final EmailValidator emailValidator;


    public String register(RegistrationRequest request){
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if(!isValidEmail){
            throw new IllegalStateException("Email not valid");
        }
        String user = userService.signUpUser(new Users(request.getName(), request.getEmail(), request.getPassword()));

        return user;
    }

}
