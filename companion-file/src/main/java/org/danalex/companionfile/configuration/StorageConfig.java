package org.danalex.companionfile.configuration;

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
     * <p>The path where the files are located.</p>
     */
    @Value("${upload.path}")
    private String uploadPath;
}
