package org.danalex.core.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

/**
 * <p>Base entity object with UUID.</p>
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder(toBuilder = true)
@MappedSuperclass
public class UuidEntity {

    /**
     * <p>ID of entity.</p>
     */
    @Id
    private UUID id;

    /**
     * <p>Generate ID for entity.</p>
     *
     * @return Current entity with id.
     */
    public UuidEntity generateId() {

        return this.toBuilder()
                .id(UUID.randomUUID())
                .build();
    }
}
