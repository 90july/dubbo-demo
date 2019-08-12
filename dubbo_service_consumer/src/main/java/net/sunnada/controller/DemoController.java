package net.sunnada.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import net.sunnada.service.DemoService;

@RestController
public class DemoController {
	
	@Resource
	private DemoService demoService;
	
	@PostMapping("/upload")
	public void uploadFile(MultipartFile file){
        try {
            byte[] buffer = file.getBytes();
            String originalFilename = file.getOriginalFilename();
            demoService.uploadFile(buffer,originalFilename);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
