package com.nosal.phonebook.repository;

import com.nosal.phonebook.entity.UserEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> {

    List<UserEntity> findByName(String name);
}
