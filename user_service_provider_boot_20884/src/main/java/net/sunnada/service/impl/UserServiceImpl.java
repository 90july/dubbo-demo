package net.sunnada.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import net.sunnada.dao.UserDao;
import net.sunnada.pojo.UserAddress;
import net.sunnada.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Service(version = "1.0.0")
@Component
public class UserServiceImpl implements UserService {
    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Resource
    private UserDao userDao;

    @Value("${dubbo.protocol.port}")
    private String dubboProtocolPort;

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        List<UserAddress> list = userDao.getUserAddressList(userId);
        //测超时时间用
        logger.info("retries1...port:"+dubboProtocolPort);
        return list;
    }
}
