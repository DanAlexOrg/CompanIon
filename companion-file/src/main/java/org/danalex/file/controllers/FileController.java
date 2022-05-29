package org.danalex.file.controllers;

import lombok.AllArgsConstructor;
import org.danalex.file.services.FileService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>Controller for handling upload and download of files requests.</p>
 */
@AllArgsConstructor
@RestController
public class FileController {

    private final FileService fileService;

    /**
     * <p>Handles a request to upload a file.</p>
     *
     * @param file File.
     */
    @PostMapping("/api/v1/upload")
    public void upload(@RequestParam("file") MultipartFile file)  {

        this.fileService.save(file);
    }
}
