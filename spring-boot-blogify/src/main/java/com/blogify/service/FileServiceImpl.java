package com.blogify.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImpl implements FileService {

	@Override
	public String uploadImage(String path, MultipartFile file) throws IOException {
		String name = file.getOriginalFilename(); // File name e.g. abc.png
		String randomId = UUID.randomUUID().toString(); // Random name generate file
		String fileName = randomId.concat(name.substring(name.lastIndexOf("."))); 
		String filepath = path + File.separator + fileName; // Full path
		File folder = new File(path); // Create folder if not created
		if(!folder.exists()) {
			folder.mkdir();
		}
		Files.copy(file.getInputStream(), Paths.get(filepath)); // File copy
		return fileName;
	}

	@Override
	public InputStream getResource(String path, String fileName) throws FileNotFoundException {
		String filePath = path + File.separator + fileName;
		InputStream inputStream = new FileInputStream(filePath);
		return inputStream;
	}

}
