package net.sunnada.controller;

import net.sunnada.pojo.UserAddress;
import net.sunnada.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/{userId}")
    public List<UserAddress> initOrder(@PathVariable String userId){
        return orderService.initOrder(userId);
    }
}
