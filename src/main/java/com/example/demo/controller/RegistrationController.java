package com.example.demo.controller;

import com.example.demo.service.RegistrationRequest;
import com.example.demo.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;

    @PostMapping
    public String register (@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }

}
