package com.my_api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my_api.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
