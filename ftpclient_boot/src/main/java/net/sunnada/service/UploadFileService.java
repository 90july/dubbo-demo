package net.sunnada.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadFileService {
    boolean uploadFile(MultipartFile file);
}
