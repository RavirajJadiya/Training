package org.java_masterR.controller;

import lombok.AllArgsConstructor;
import org.java_masterR.dto.UserDto;
import org.java_masterR.model.User;
import org.java_masterR.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

    private UserService userService;

    // build create User REST API
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        UserDto userDto = new UserDto();
        userService.createUser(userDto);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

}
