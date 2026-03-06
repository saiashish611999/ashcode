package com.ashcode.ashcode.contracts;

import com.ashcode.ashcode.dtos.auth.AuthResponse;
import com.ashcode.ashcode.dtos.auth.LoginRequest;
import com.ashcode.ashcode.dtos.auth.SignupRequest;

public interface AuthService {

    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);

}
