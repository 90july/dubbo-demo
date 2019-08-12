package net.sunnada.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import net.sunnada.pojo.DatePojo;
import net.sunnada.service.DateService;

import java.util.Date;
import java.util.HashMap;

/**
 * @author ariel
 * @create 2019-07-03 9:51
 */
@Service
public class DateServiceDubboImpl implements DateService {
    @Override
    public void testDatePojo(DatePojo datePojo) {
        System.out.println(datePojo.getDate());
        System.out.println(datePojo.getMap());
    }

    @Override
    public void testDate(Date date) {
        System.out.println(date);
    }

    @Override
    public void testMap(HashMap<String, Object> map) {
        System.out.println(map);
    }
}
