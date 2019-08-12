package net.sunnada.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public interface UserService {

	public void uploadFile(byte[] file, String originalFilename);
}
