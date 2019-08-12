package net.sunnada.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import net.sunnada.dubbo.service.DemoService;
import net.sunnada.service.TestDemoService;

@org.springframework.stereotype.Service
public class TestDemoServiceImpl implements TestDemoService {
    @Reference
    private DemoService demoService;
    @Override
    public String demo(String name) {
        return demoService.demo(name);
    }
}
