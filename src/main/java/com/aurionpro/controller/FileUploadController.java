package com.aurionpro.controller;

import com.aurionpro.entity.FileEntity;
import com.aurionpro.repository.IFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class FileUploadController {

    private final IFileRepository fileRepository;

    @Autowired
    public FileUploadController(IFileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @GetMapping("/files")
    public List<FileEntity> listUploadedFiles() {
        return fileRepository.findAll();
    }

    @PostMapping("/upload")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Please select a file to upload");
        }

        FileEntity fileEntity = new FileEntity();
		fileEntity.setFileName(file.getOriginalFilename());
//            fileEntity.setFileType(file.getContentType());
//            fileEntity.setData(file.getBytes());
//            fileEntity.setUploadTimestamp(LocalDateTime.now());

		fileRepository.save(fileEntity);

		return ResponseEntity.ok("File uploaded successfully: " + file.getOriginalFilename());
    }
}
