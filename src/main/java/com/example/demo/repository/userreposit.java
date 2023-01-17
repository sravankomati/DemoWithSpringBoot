package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.userinfo;

public interface userreposit extends MongoRepository<userinfo, String> {

}
