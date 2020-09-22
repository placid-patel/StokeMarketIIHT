package com.example.patel.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.patel.user.models.User;

@Repository
public interface UserDAO extends JpaRepository<User, String> {

}

