package com.sjzc.enote.domain;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) ////主键生成策略

    private Long id;
    private String name;
    private String password;
    private String phone;
    private String sign;
    private String avatar;
    private String level;






    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public User(String name, String password, String phone, String sign, String avatar, String level) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.sign = sign;
        this.avatar = avatar;
        this.level = level;
    }

    public User(){

    }
}
