package com.ashcode.ashcode.services;

import org.springframework.stereotype.Service;

import com.ashcode.ashcode.contracts.AuthService;
import com.ashcode.ashcode.dtos.auth.AuthResponse;
import com.ashcode.ashcode.dtos.auth.LoginRequest;
import com.ashcode.ashcode.dtos.auth.SignupRequest;

@Service
public class AuthServiceImplementation implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'signup'");
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

}
