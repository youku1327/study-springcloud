package com.zszxz.zuul.server.controller;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author lsc
 * <p>zuul文件上传 </p>
 */
@RestController
public class ZuulFileUploadController {

    @PostMapping("/file/upload")
    public String fileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        // 上传简单文件名
        String originalFilename = file.getOriginalFilename();
        byte[] bytes = file.getBytes();
        File saveFile = new File(originalFilename);
        FileCopyUtils.copy(bytes,saveFile);
        return saveFile.getAbsolutePath();
    }
}
