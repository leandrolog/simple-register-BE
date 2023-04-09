package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return true;
    }
    // Classe que faz a validação pra confirmar se o email è válido, neste
    //caso sempre sera true fazendo com que a validação seja feita no front
}
