package com.demo.springboot.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.Service.UserService;


/**
 * 用户控制层
 * @author CZZ
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("get")
    public Object get(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        return userService.get(userId);
    }


    @RequestMapping("list")
    private Object list() {
        return userService.list();
    }

}
