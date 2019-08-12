package net.sunnada.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import net.sunnada.dubbo.service.DemoService;
import net.sunnada.service.TestDemoService;

import java.io.IOException;

public class TestDemoServiceImpl implements TestDemoService {
    @Reference
    private DemoService demoService;
    @Override
    public void demo(String name) {
        System.out.println(demoService.demo(name));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
