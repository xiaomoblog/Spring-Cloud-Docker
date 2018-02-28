package cn.jiayao.service.impl;

import cn.jiayao.dao.UserDao;
import cn.jiayao.domain.User;
import cn.jiayao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author admin
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getOne(Long id) {
        return userDao.getOne(id);
    }
}
