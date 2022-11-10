package com.yolkar.e.commerce.repository;

import com.yolkar.e.commerce.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findUserByEmail(String email);

}
