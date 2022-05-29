package org.danalex.file.services;

import lombok.AllArgsConstructor;
import org.danalex.file.configuration.StorageConfig;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * <p>Service for uploading of files to storage.</p>
 */
@AllArgsConstructor
@Service
public class StorageService {

    private final StorageConfig storageConfig;

    /**
     * <p>Upload file into the storage.</p>
     *
     * @param file File.
     * @param name File name.
     */
    public void upload(MultipartFile file, String name) {

        if (file != null) {

            this.createDirectory();
            try {
                file.transferTo(new File(this.storageConfig.getUploadPath() + "/" + name));
            } catch (IOException e) {

                throw new IllegalStateException("Failed to save file");
            }
        }
    }

    /**
     * <p>Create directory for uploading of files.</p>
     */
    private void createDirectory() {

        File uploadDir = new File(this.storageConfig.getUploadPath());
        if (!uploadDir.exists()){

            uploadDir.mkdirs();
        }
    }
}
