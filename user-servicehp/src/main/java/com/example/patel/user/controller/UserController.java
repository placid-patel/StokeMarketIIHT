package com.example.patel.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.patel.user.dtos.UserRequestModel;
import com.example.patel.user.dtos.UserResponseModel;
import com.example.patel.user.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
    UserService userService;

    @GetMapping("/test")
    public String test() {
        return "user service is working";
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponseModel> createAccount(@RequestBody UserRequestModel userRequestModel) {
        UserResponseModel user = userService.addUser(userRequestModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PatchMapping("/updateInfo")
    public ResponseEntity<UserResponseModel> updateUserInfo(@RequestBody UserRequestModel userRequestModel) {
        UserResponseModel user = userService.updateUser(userRequestModel);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
    }
}
