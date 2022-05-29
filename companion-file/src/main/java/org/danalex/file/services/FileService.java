package org.danalex.file.services;

import lombok.AllArgsConstructor;
import org.danalex.file.entities.File;
import org.danalex.file.repositories.FileRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>Service of file.</p>
 */
@AllArgsConstructor
@Service
public class FileService {

    private final FileRepository fileRepository;

    private final StorageService storageService;

    /**
     * <p>Save file into storage and database.</p>
     *
     * @param file File.
     */
    public void save(MultipartFile file) {

        File savedFile = this.fileRepository.create(
                File.builder()
                        .name(file.getOriginalFilename())
                        .build()
        );

        this.storageService.upload(file, savedFile.getFullname());
    }

}
