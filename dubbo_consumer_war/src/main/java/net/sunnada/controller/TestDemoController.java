package net.sunnada.controller;

import net.sunnada.service.TestDemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestDemoController {
    @Resource
    private TestDemoService testDemoService;
    @GetMapping("/test/{name}")
    public String test(@PathVariable String name){
        return testDemoService.demo(name);
    }
}
