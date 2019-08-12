package net.sunnada.dao.impl;

import net.sunnada.dao.UserDao;
import net.sunnada.pojo.UserAddress;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
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
