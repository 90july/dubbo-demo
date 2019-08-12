package net.sunnada.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import net.sunnada.pojo.UserAddress;
import net.sunnada.service.OrderService;
import net.sunnada.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Reference(url = "dubbo://192.168.168.73:20880")
    private UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        return userService.getUserAddressList(userId);
    }
}
