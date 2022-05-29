package org.danalex.file.configuration;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <p>Web configuration of service companion-file.</p>
 */
@AllArgsConstructor
@Configuration
public class WebConfig implements WebMvcConfigurer {

    private final StorageConfig storageConfig;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){

        registry.addResourceHandler(StorageConfig.DOWNLOAD_PATH + "**")
                .addResourceLocations("file://" + this.storageConfig.getUploadPath() + "/");
    }
}
