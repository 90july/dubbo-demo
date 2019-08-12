package net.sunnada.service.impl;

import net.sunnada.pojo.UserAddress;
import net.sunnada.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        List<UserAddress> list = new ArrayList<>(0);
        UserAddress address1 = new UserAddress(1, "xxxxxxx", "1", "xxxxxxxxxxxxxx", "xxx-xxxxxxxx", "Y");
        UserAddress address2 = new UserAddress(2, "xxxxxxx", "1", "xxxxxxxxxxxxxx", "xxx-xxxxxxxx", "N");
        list.add(address1);
        list.add(address2);
        return list;
    }
}
