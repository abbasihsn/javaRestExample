package com.abbasihsn.restapi.demo.dao;


import com.abbasihsn.restapi.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, Long> {


    @Override
    List<User> findAll();

    List<User> findByEmail(String email);
}
