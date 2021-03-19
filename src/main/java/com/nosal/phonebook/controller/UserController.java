package com.nosal.phonebook.controller;

import com.nosal.phonebook.model.User;
import com.nosal.phonebook.service.UserService;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/user")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> add(@RequestBody @NotNull User user) {
        log.info("UserController#add user {}", user);
        userService.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/{name}")
    public ResponseEntity<List<User>> getByName(@PathVariable String name) {
        log.info("UserController#getByName with name {}", name);
        List<User> byName = userService.findByName(name);
        return new ResponseEntity<>(byName, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        log.info("UserController#getAll");
        List<User> all = userService.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }
}
