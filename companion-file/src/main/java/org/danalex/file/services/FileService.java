package org.danalex.file.services;

import lombok.AllArgsConstructor;
import org.danalex.file.entities.File;
import org.danalex.file.exceptions.FileNotFoundException;
import org.danalex.file.repositories.FileRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

/**
 * <p>Service of file.</p>
 */
@AllArgsConstructor
@Service
public class FileService {

    private final FileRepository fileRepository;

    private final StorageService storageService;


    /**
     * <p>Get file from database by id.</p>
     *
     * @param id ID.
     *
     * @return File.
     *
     * @throws FileNotFoundException If the file was not found.
     */
    public File get(UUID id) {

        return this.fileRepository.findById(id).orElseThrow(() -> new FileNotFoundException(id));
    }

    /**
     * <p>Save file into storage and database.</p>
     *
     * @param file File.
     */
    public File save(MultipartFile file) {

        File savedFile = this.fileRepository.create(
                File.builder()
                        .name(file.getOriginalFilename())
                        .build()
        );

        this.storageService.upload(file, savedFile.getFullname());

        return savedFile;
    }
}
