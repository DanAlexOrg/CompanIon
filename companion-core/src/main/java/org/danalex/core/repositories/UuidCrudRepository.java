package org.danalex.core.repositories;

import org.danalex.core.entities.UuidEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * <p>Interface of repository for {@link UuidEntity}.</p>
 */
public interface  UuidCrudRepository<E extends UuidEntity>  extends CrudRepository<E, UUID> {

    /**
     * <p>Save entity to database.</p>
     *
     * @param entity Entity.
     *
     * @return Saved entity.
     */
    default E create(E entity) {

        if (entity.getId() == null) {

            entity.generateId();
        }

        return this.save(entity);
    }
}
