package net.sunnada.dubbo.service.impl;

import net.sunnada.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService {
    public String demo(String name) {
        return "hello,"+name;
    }
}
