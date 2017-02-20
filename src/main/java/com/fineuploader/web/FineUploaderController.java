package com.fineuploader.web;

import com.fineuploader.model.UploadResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.annotation.MultipartConfig;

@RestController
@MultipartConfig
public class FineUploaderController {

    @CrossOrigin
    @PostMapping("/uploads")
    public ResponseEntity<UploadResponse> upload(
            @RequestParam("qqfile") MultipartFile file,
            @RequestParam("qquuid") String uuid,
            @RequestParam("qqfilename") String fileName,
            @RequestParam(value = "qqpartindex", required = false, defaultValue = "-1") int partIndex,
            @RequestParam(value = "qqtotalparts", required = false, defaultValue = "-1") int totalParts,
            @RequestParam(value = "qqtotalfilesize", required = false, defaultValue = "-1") long totalFileSize) {



        return ResponseEntity.ok().body(new UploadResponse(true));
    }



}
