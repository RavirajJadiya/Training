package org.java_masterR.mapper;

import org.apache.tomcat.util.bcel.classfile.Constant;
import org.java_masterR.dto.UserDto;
import org.java_masterR.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

   User mapToUser(UserDto userDto);

}
