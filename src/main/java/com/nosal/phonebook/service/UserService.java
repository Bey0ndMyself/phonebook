package com.nosal.phonebook.service;

import com.nosal.phonebook.entity.UserEntity;
import com.nosal.phonebook.mapper.UserMapper;
import com.nosal.phonebook.model.User;
import com.nosal.phonebook.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public void save(User user) {
        userRepository.save(userMapper.toEntity(user));
    }

    public List<User> findByName(String name) {
        return userMapper.toModel(userRepository.findByName(name));
    }

    public List<User> findAll() {
        Iterable<UserEntity> iter = userRepository.findAll();
        List<UserEntity> all = StreamSupport.stream(iter.spliterator(), false)
            .collect(Collectors.toList());
        return userMapper.toModel(all);
    }
}
