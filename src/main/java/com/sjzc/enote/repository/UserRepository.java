package com.sjzc.enote.repository;

import com.sjzc.enote.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //根据用户名查询用户--name判重校验

    User findByName(@Param("name") String name);

    // 根据手机号查询用户--phone判重校验

    User findByPhone(@Param("phone") String phone);



}


