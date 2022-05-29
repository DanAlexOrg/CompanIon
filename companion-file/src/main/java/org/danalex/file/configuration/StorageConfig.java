package org.danalex.file.configuration;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Configuration of storage.</p>
 */
@Getter
@Configuration
public class StorageConfig {

    /**
     * <p>The path for download of file.</p>
     */
    public static String DOWNLOAD_PATH = "/api/v1/file/";


    /**
     * <p>The path where the files are located.</p>
     */
    @Value("${upload.path}")
    private String uploadPath;
}
