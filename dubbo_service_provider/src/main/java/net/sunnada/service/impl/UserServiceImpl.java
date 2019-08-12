package net.sunnada.service.impl;

import java.io.*;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import net.sunnada.service.UserService;
import org.springframework.web.multipart.MultipartFile;

@Service
@Component
public class UserServiceImpl implements UserService {

	public void uploadFile(byte[] file, String originalFilename) {
		long begin = System.currentTimeMillis();
		// TODO Auto-generated method stub
		System.out.println(file);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(file);
        byte[] buffer=new byte[1024];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:/"+originalFilename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            int len;
            while((len=bufferedInputStream.read(buffer))!=-1){
                bufferedOutputStream.write(buffer, 0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
		System.out.println("开始时间-结束时间"+(System.currentTimeMillis()-begin)/1000+"s");

	}
}
