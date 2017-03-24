package com.xm4399.controller;

import com.xm4399.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hemintang on 17-3-24.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping(value = "register", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String register(User user){
        Session session = sessionFactory.openSession();
        session.save(user);
        session.beginTransaction().commit();
        return "注册成功";
    }
}
