package net.sunnada.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * @author ariel
 * @create 2019-07-03 9:48
 */
public class DatePojo implements Serializable {

    private Map<String,Object> map;
    private Date date;

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
