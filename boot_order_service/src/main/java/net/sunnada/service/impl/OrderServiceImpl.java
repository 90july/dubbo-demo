package net.sunnada.service.impl;

import net.sunnada.pojo.UserAddress;
import net.sunnada.service.OrderService;
import net.sunnada.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Reference
    private UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        return userService.getUserAddressList(userId);
    }

    public OrderServiceImpl() {
        System.out.println("net.sunnada.service.impl.OrderServiceImpl");
    }
}
