package net.sunnada.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import net.sunnada.pojo.UserAddress;
import net.sunnada.service.OrderService;
import net.sunnada.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
//    @Reference(version = "*")
    @Reference(stub = "net.sunnada.service.impl.UserServiceStub")
//    @Reference(timeout = 3000)//设置超时时间为3秒。缺省时使用dubbo.consumer.timeout,默认为1秒
//    @Reference(check = false)//关闭启动时检查
    private UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        return userService.getUserAddressList(userId);
    }
}
