package net.sunnada.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import net.sunnada.service.DemoService;
import net.sunnada.service.UserService;

@Component
public class DemoServiceImpl implements DemoService{

	@Reference(timeout=30000)
	private UserService userService;
	
	public void uploadFile(byte[] file, String originalFilename) {
		// TODO Auto-generated method stub
		userService.uploadFile(file, originalFilename);
	}

}
