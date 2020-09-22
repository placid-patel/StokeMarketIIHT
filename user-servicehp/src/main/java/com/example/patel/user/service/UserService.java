package com.example.patel.user.service;

import com.example.patel.user.dtos.UserRequestModel;
import com.example.patel.user.dtos.UserResponseModel;

public interface UserService {
    public UserResponseModel addUser(UserRequestModel userRequestModel);
    public UserResponseModel updateUser(UserRequestModel userRequestModel);
}
