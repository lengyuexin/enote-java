package com.sjzc.enote.repository;

import com.sjzc.enote.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //根据用户名查询用户--name判重校验

    User findByName(@Param("name") String name);

    // 根据手机号查询用户--phone判重校验

    User findByPhone(@Param("phone") String phone);


    //更新用户个性签名

    @Transactional(rollbackFor = Exception.class)
    @Modifying
    @Query(value = "update users  set sign=?1 where name=?2", nativeQuery = true)
    void updateSignByName(@Param("sign") String sign, @Param("name") String name);  //更新用户个性签名

    //更新用户手机号

    @Transactional(rollbackFor = Exception.class)
    @Modifying
    @Query(value = "update users  set phone=?1 where name=?2", nativeQuery = true)
    void updatePhoneByName(@Param("phone") String phone, @Param("name") String name);


    //更新用户密码

    @Transactional(rollbackFor = Exception.class)
    @Modifying
    @Query(value = "update users  set password=?1 where name=?2", nativeQuery = true)
    void updatePwdByName(@Param("password") String password, @Param("name") String name);

    //更新用户头像

    @Transactional(rollbackFor = Exception.class)
    @Modifying
    @Query(value = "update users  set avatar=?1 where name=?2", nativeQuery = true)
    void updateAvatarByName(@Param("avatar") String avatar, @Param("name") String name);



}


