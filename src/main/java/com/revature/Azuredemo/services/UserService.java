package com.revature.Azuredemo.services;


import com.revature.Azuredemo.model.User;
import com.revature.Azuredemo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void postUser(User user) {
        userRepo.save(user);
    }

    public User getUserById(Integer Id) {
        return userRepo.getById(Id);
    }
}
