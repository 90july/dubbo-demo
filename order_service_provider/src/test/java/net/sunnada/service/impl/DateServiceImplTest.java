package net.sunnada.service.impl;

import net.sunnada.pojo.DatePojo;
import net.sunnada.service.DateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import static org.junit.Assert.*;

/**
 * @author ariel
 * @create 2019-07-03 9:55
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:META-INF/spring/applicationContext-dubbo.xml")
public class DateServiceImplTest {

    @Autowired
    private DateService dateService;

    @Test
    public void testDatePojo() {
        DatePojo datePojo = new DatePojo();
        HashMap<String, Object> map = new HashMap<>();
        map.put("date", new Date());
        map.put("byteArray","abcd".getBytes());
//        map.put("name","中");
        datePojo.setMap(map);
        datePojo.setDate(new Date());
        dateService.testDatePojo(datePojo);
    }
    @Test
    public void testDate() {
        dateService.testDate(new Date());
    }
    @Test
    public void testMap() {
        HashMap<String, Object> map = new HashMap<>(0);
//        map.put("id", UUID.randomUUID().toString());
        map.put("name", new Timestamp(new Date().getTime()));
        dateService.testMap(map);
    }
}