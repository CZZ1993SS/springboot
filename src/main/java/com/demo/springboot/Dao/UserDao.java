package com.demo.springboot.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demo.springboot.Bean.User;


/**
 * 用户 DAO 接口
 * @author CZZ
 */
public interface UserDao {

    /**
     * 新增
     */
    int save(User user);


    /**
     * 删除
     */
    int deleteById(String userId);

    /**
     * 修改
     */
    int updateAgeById(@Param("USER_ID") String userId, @Param("AGE") Integer age);

    /**
     * 查询
     * tips: 单条
     */
    User get(String userId);


    /**
     * 查询
     * tips: 列表
     */
    List<User> list();

}
