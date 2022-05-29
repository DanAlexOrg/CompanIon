package org.danalex.file.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.danalex.core.entities.UuidEntity;

import javax.persistence.Entity;

/**
 * <p>Entity-class for file.</p>
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@SuperBuilder(toBuilder = true)
@Entity
public class File extends UuidEntity {

    /**
     * <p>File name.</p>
     */
    private String name;

    /**
     * <p>File upload path.</p>
     */
    private String fullname;


    /**
     * <p>Generate fullname of file.</p>
     *
     * @return Current file with fullname.
     */
    public File generateFullname() {

        return this.toBuilder()
                .fullname(this.getId() + this.getName())
                .build();
    }
}
