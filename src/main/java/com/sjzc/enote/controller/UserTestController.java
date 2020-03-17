package com.sjzc.enote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserTestController {

    @CrossOrigin
    @RequestMapping(value="/add_user_ui")
    public String saveUI() { return "add_user_ui"; }


    @CrossOrigin
    @RequestMapping(value="/check_name_ui")
    public String checkNameUI() { return "check_name_ui"; }

    @CrossOrigin
    @RequestMapping(value="/check_phone_ui")
    public String checkPhoneUI() { return "check_phone_ui"; }

  @CrossOrigin
    @RequestMapping(value="/login_ui")
    public String loginUI() { return "login_ui"; }

}
