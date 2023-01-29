package com.example.bookmanager.bookmanager.repository;

import com.example.bookmanager.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
