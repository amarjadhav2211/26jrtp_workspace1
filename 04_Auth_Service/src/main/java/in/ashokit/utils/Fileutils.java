package in.ashokit.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.web.multipart.MultipartFile;

public class Fileutils {
	
	public static String saveFile(String fileName,MultipartFile file) throws Exception
	{
		Path uploadPath=Paths.get("user-images");  // folder where u want to upload the image file
		if(!Files.exists(uploadPath))
		{
			Files.createDirectories(uploadPath);
		}
	// for every image generate one code 
	String fileCode=RandomStringUtils.randomAlphanumeric(8);
	       //Path filePath = uploadPath.resolve(fileCode+"-"+fileName);
	Path filePath = uploadPath.resolve(file.getOriginalFilename());
	       Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
	      // return fileCode; // this file code will be stored in DB
	       
	       return filePath.getFileName().toString();
	}

}
