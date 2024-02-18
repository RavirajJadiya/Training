package org.java_masterR.mapper;

import javax.annotation.processing.Generated;
import org.java_masterR.dto.UserDto;
import org.java_masterR.model.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-12T16:27:52+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User mapToUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        return user;
    }
}
