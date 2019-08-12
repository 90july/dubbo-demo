package net.sunnada.test;


import org.apache.commons.net.ftp.FTPClient;

import java.io.FileInputStream;
import java.io.IOException;

public class FtpClientTest{
    public static void main(String[] args) {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect("192.168.168.104",21);
            ftpClient.login("ftpuser","ftpuser");
            //设置文件类型
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.storeFile("nginx-1.13.12.zip",new FileInputStream("d:/nginx-1.13.12.zip"));
            ftpClient.logout();
            System.out.println("上传成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
