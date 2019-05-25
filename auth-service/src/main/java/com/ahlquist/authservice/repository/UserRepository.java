package com.ahlquist.authservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ahlquist.authservice.domain.User;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	Optional<User> findByUsername(String username);

}
