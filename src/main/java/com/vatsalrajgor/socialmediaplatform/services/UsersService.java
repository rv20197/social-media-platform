package com.vatsalrajgor.socialmediaplatform.services;

import com.vatsalrajgor.socialmediaplatform.models.User;
import com.vatsalrajgor.socialmediaplatform.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UserRepository userRepo;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public User saveUser(User user){
        return userRepo.save(user);
    }
}
