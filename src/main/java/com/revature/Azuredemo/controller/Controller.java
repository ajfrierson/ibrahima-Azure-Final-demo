package com.revature.Azuredemo.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.Azuredemo.model.User;
import com.revature.Azuredemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class Controller {

    private UserService userService;
    private ObjectMapper objectMapper;

    @Autowired
    public Controller(UserService userService, ObjectMapper objectMapper) {
        this.userService = userService;
        this.objectMapper =objectMapper;
    }

    @PostMapping
    public boolean postUser(@RequestBody User user) {

        try {
            userService.postUser(user);
            return true;

        }catch (Exception e){
            return false;
        }
    }

    @GetMapping("/{Id}")
    public String getUserById(@PathVariable("Id") Integer Id) {
        return userService.getUserById(Id).toString();
    }

//    @GetMapping("/{iD}")
//    public String getUserById(@PathVariable("iD") Integer iD) {
//
//        return userService.getUserById(iD).toString();
//    }


}
