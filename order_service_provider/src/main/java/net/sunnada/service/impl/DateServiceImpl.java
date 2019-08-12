package net.sunnada.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import net.sunnada.pojo.DatePojo;
import net.sunnada.service.DateService;

import java.util.Date;
import java.util.HashMap;

/**
 * @author ariel
 * @create 2019-07-03 9:53
 */
@Service
public class DateServiceImpl implements DateService {
    @Reference
    private DateService dateServiceDubboImpl;
    @Override
    public void testDatePojo(DatePojo datePojo) {
        dateServiceDubboImpl.testDatePojo(datePojo);
    }

    @Override
    public void testDate(Date date) {
        dateServiceDubboImpl.testDate(date);
    }

    @Override
    public void testMap(HashMap<String, Object> map) {
        dateServiceDubboImpl.testMap(map);
    }
}
