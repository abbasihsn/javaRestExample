package com.abbasihsn.restapi.demo.rest;


import com.abbasihsn.restapi.demo.model.User;
import com.abbasihsn.restapi.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userRest {

    UserService userService;

    public userRest(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    List<User> getAll() {
        return userService.getAllUsers();
    }

    @PostMapping("/save")
    String saveUser(@RequestBody  User user){
        userService.saveUser(user);
        return "done";
    }


    @GetMapping("/search")
    List<User> searchUserByEmail(String email){
        return userService.getUserByEmail(email);
    }


}
