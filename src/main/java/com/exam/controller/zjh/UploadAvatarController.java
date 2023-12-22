package com.exam.controller.zjh;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@CrossOrigin
public class UploadAvatarController {


    @PostMapping("/upload")
    public String getAvatar(MultipartFile file){
        String filename = file.getOriginalFilename();
        String newName = System.currentTimeMillis() + filename.substring(filename.lastIndexOf("."));
        String path = "E:\\examsystem\\src\\assets\\img";
        File newPath = new File(path);
        if (!newPath.exists())
            newPath.mkdir();
        try {
            File newFile = new File(newPath,newName);
            file.transferTo(newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(newName);
        return newName;
    }
}
