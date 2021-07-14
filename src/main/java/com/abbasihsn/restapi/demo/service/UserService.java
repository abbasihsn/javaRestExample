package com.abbasihsn.restapi.demo.service;


import com.abbasihsn.restapi.demo.dao.UserDao;
import com.abbasihsn.restapi.demo.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class UserService {
    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getAllUsers() {
        return  userDao.findAll();
    }


    public void saveUser(User user){
        userDao.save(user);
    }

    public List<User> getUserByEmail(String email){
        return userDao.findByEmail(email);
    }
}
