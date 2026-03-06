package com.ashcode.ashcode.contracts;

import com.ashcode.ashcode.dtos.auth.UserProfileResponse;

public interface UserService {

    UserProfileResponse getProfile(Long userId);

}
