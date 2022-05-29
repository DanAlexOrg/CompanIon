package org.danalex.file.repositories;

import org.danalex.core.repositories.UuidCrudRepository;
import org.danalex.file.entities.File;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends UuidCrudRepository<File> {

    @Override
    default File create(File file) {

        File fileWithId = (File)file.generateId();
        File saveFile = fileWithId.generateFullname();
        return this.save(saveFile);
    }
}
