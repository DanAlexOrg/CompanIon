package org.danalex.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

/**
 * <p>Data with UUID.</p>
 */
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@SuperBuilder(toBuilder = true)
public class UuidDTO {

    /**
     * <p>ID.</p>
     */
    private final UUID id;
}
