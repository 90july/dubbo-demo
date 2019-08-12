package net.sunnada.service.impl;

import net.sunnada.dao.UserDao;
import net.sunnada.pojo.UserAddress;
import net.sunnada.service.UserService;

import javax.annotation.Resource;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        return userDao.getUserAddressList(userId);
    }
}
