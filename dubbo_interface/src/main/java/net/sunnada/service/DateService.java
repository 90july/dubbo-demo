package net.sunnada.service;

import net.sunnada.pojo.DatePojo;

import java.util.Date;
import java.util.HashMap;

/**
 * @author ariel
 * @create 2019-07-03 9:49
 */
public interface DateService {

    void testDatePojo(DatePojo datePojo);

    void testDate(Date date);

    void testMap(HashMap<String, Object> map);
}
