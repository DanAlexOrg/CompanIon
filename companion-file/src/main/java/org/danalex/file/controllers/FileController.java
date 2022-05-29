package org.danalex.file.controllers;

import lombok.AllArgsConstructor;
import org.danalex.file.dto.DownloadFileDTO;
import org.danalex.file.services.FileService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

/**
 * <p>Controller for handling upload and download of files requests.</p>
 */
@AllArgsConstructor
@RestController
public class FileController {

    private final FileService fileService;


    /**
     * <p>Handles a request to download a file.</p>
     *
     * @param id ID of file.
     *
     * @return File download data.
     */
    @GetMapping("/api/v1/download/{id}")
    public @ResponseBody DownloadFileDTO download(@PathVariable UUID id) {

        return DownloadFileDTO.of(this.fileService.get(id));
    }

    /**
     * <p>Handles a request to upload a file.</p>
     *
     * @param file File.
     *
     * @return File download data.
     */
    @PostMapping("/api/v1/upload")
    public @ResponseBody DownloadFileDTO upload(@RequestParam("file") MultipartFile file)  {

        return DownloadFileDTO.of(this.fileService.save(file));
    }
}
