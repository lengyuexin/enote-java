package com.sjzc.enote.repository;

import com.sjzc.enote.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test

    public void save(){
         User user = new User(
                 "tom",
                 "123456",
                 "10086",
                 "hello wrold",
                 "",
                 "writer");
         userRepository.save(user);
        System.out.println("插入成功");
    }}
