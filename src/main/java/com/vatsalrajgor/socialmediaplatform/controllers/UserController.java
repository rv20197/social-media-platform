package com.vatsalrajgor.socialmediaplatform.controllers;

import com.vatsalrajgor.socialmediaplatform.models.User;
import com.vatsalrajgor.socialmediaplatform.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/social/users")
public class UserController {
    @Autowired
    private UsersService usersService;

    @GetMapping("")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(this.usersService.getAllUsers(),HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return new ResponseEntity<>(this.usersService.saveUser(user),HttpStatus.CREATED);
    }

}
