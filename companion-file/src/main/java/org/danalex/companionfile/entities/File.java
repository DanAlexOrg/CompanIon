package org.danalex.companionfile.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/**
 * <p>Entity-class for file.</p>
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class File {

    /**
     * <p>File ID.</p>
     */
    @Id
    private UUID id;

    /**
     * <p>File name.</p>
     */
    private String name;

    /**
     * <p>File upload path.</p>
     */
    private String path;
}
