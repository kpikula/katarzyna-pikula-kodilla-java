package com.kodilla.facade;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
class Authenticator {
    public boolean isAuthenticated(Long userId) {
        Random random = new Random();
        return random.nextBoolean();
    }
}
