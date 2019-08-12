package net.sunnada.dao;

import net.sunnada.pojo.UserAddress;

import java.util.List;

public interface UserDao {
    List<UserAddress> getUserAddressList(String userId);
}
