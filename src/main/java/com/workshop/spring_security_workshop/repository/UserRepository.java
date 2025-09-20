package com.workshop.spring_security_workshop.repository;

import com.workshop.spring_security_workshop.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String username);
    Optional<User> findByVerificationCode(String verificationCode);
    Optional<User> findByUsername(String username);
}
