package org.java_masterR.service.impl;

import org.java_masterR.dto.UserDto;
import org.java_masterR.model.User;
import org.java_masterR.repository.UserRepository;
import org.java_masterR.service.UserService;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {

        User user = new User();
        user.setId(userDto.getId());
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());


        User savedUser = userRepository.save(user);


        UserDto savedUserDto = new UserDto();
        savedUserDto.setEmail(savedUser.getEmail());
        savedUserDto.setFirstName(savedUser.getLastName());
        savedUserDto.setLastName(savedUser.getFirstName());
        savedUserDto.setId(savedUser.getId());


        return savedUserDto;
    }
}
