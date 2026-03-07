package com.ashcode.ashcode.services;

import org.springframework.stereotype.Service;

import com.ashcode.ashcode.contracts.UserService;
import com.ashcode.ashcode.dtos.auth.UserProfileResponse;

@Service
public class UserServiceImplementation implements UserService {

    @Override
    public UserProfileResponse getProfile(Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProfile'");
    }

}
