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

@CrossOrigin(origins = "http://localhost:4200")
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
    public ResponseEntity<String> handleFileUpload(
            @RequestParam("file") MultipartFile file,
            @RequestParam("fileadharcard") MultipartFile fileadharcard,
            @RequestParam("filepancard") MultipartFile filepancard) {
        if (file.isEmpty() || fileadharcard.isEmpty() || filepancard.isEmpty()) {
            return ResponseEntity.badRequest().body("Please select all files to upload");
        }

        FileEntity aadharCardEntity = new FileEntity();
        aadharCardEntity.setFileadharcard(fileadharcard.getOriginalFilename());
        aadharCardEntity.setFilepancard(filepancard.getOriginalFilename());
        aadharCardEntity.setFileName(file.getOriginalFilename());
        fileRepository.save(aadharCardEntity);

        return ResponseEntity.ok("Files uploaded successfully");
    }

		
    }
