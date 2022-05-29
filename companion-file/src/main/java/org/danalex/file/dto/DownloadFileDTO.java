package org.danalex.file.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.danalex.core.dto.UuidDTO;
import org.danalex.file.configuration.StorageConfig;
import org.danalex.file.entities.File;

/**
 * <p>File download data.</p>
 */
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@SuperBuilder(toBuilder = true)
public class DownloadFileDTO extends UuidDTO {

    /**
     * <p>File name.</p>
     */
    private final String name;

    /**
     * <p>File download link.</p>
     */
    private final String downloadLink;


    /**
     * <p>Build file download data from {@link File}.</p>
     *
     * @param file File.
     *
     * @return File download data.
     */
    public static DownloadFileDTO of(File file) {

        return DownloadFileDTO.builder()
                .id(file.getId())
                .name(file.getName())
                .downloadLink(StorageConfig.DOWNLOAD_PATH + file.getFullname())
                .build();
    }
}
