package cn.jiayao.controller;

import cn.jiayao.dao.UserDao;
import cn.jiayao.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * @RestController
 */
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/{id}")
    public  User  findUserById(@PathVariable Long id){
        User user = userDao.getOne(id);
        System.out.println(user);
        return user;
    }

    @GetMapping("/get")
    public User getUser(){
        User user = new User();
        user.setId(99L);
        user.setAge((short) 20);
        user.setUsername("张无忌");
        user.setName("赵敏");
        System.out.println(user);
        return user;
    }
}
