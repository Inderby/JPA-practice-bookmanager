package com.example.bookmanager.bookmanager.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test(){
        User user = new User();
        user.setEmail("inderby@study.com");
        user.setName("inderby");

        User user3 = User.builder()
                .name("inderby")
                .email("inderby@study.com")
                .build();

        System.out.println(">>>" + user);


    }

}