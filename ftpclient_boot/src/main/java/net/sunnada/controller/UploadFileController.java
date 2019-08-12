package net.sunnada.controller;

import net.sunnada.service.UploadFileService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
public class UploadFileController {

    @Resource
    private UploadFileService uploadFileService;

    @PostMapping("uploadFile")
    public boolean uploadFile(MultipartFile file){
        return uploadFileService.uploadFile(file);
    }

}
