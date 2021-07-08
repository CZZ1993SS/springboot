package com.demo.springboot.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.Bean.User;
import com.demo.springboot.Dao.UserDao;


/**
 * 用户服务层
 * @author CZZ
 */
@Service
public class UserService implements UserDao {


    @Autowired
    private UserDao dao;


    /**
     * 新增
     */
    @Override
    public int save(User user) {
        return dao.save(user);
    }

    /**
     * 删除
     */
    @Override
    public int deleteById(String userId) {
        return dao.deleteById(userId);
    }

    /**
     * 修改
     */
    @Override
    public int updateAgeById(String userId, Integer age) {
        return dao.updateAgeById(userId, age);
    }

    /**
     * 查询
     */
    @Override
    public User get(String userId) {
        return dao.get(userId);
    }

    /**
     * 查询
     * tips: 列表
     */
    @Override
    public List<User> list() {
        return dao.list();
    }
}
