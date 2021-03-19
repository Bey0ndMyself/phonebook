package com.nosal.phonebook.mapper;

import com.nosal.phonebook.entity.UserEntity;
import com.nosal.phonebook.model.User;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface UserMapper {

    User toModel(UserEntity entity);

    UserEntity toEntity(User model);

    List<User> toModel(List<UserEntity> users);
}
