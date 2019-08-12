package net.sunnada.service.impl;


import net.sunnada.pojo.UserAddress;
import net.sunnada.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:META-INF/spring/applicationContext-dubbo.xml")
public class OrderServiceImplTest {
    @Resource
    private OrderService orderService;
    @Test
    public void test() {
        List<UserAddress> userAddresses = orderService.initOrder("1");
        for (UserAddress userAddress : userAddresses) {
            System.out.println(userAddress);
        }
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}