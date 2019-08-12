package net.sunnada.service.impl;

import net.sunnada.pojo.UserAddress;
import net.sunnada.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.util.List;

public class UserServiceStub implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceStub.class);

    private final UserService userService;

    //传入的是UserService的远程代理对象
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        logger.info("UserServiceStub.getUserAddressList...");
        if(!StringUtils.isEmpty(userId)){
            return userService.getUserAddressList(userId);
        }
        return  null;
    }
}
