package com.semicolon.notemanagementsystem.repositories;

import com.semicolon.notemanagementsystem.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    public User findByUsername(String username);
}
