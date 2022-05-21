package org.danalex.companionfile.repositories;

import org.danalex.companionfile.entities.File;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FileRepository extends CrudRepository<File, UUID> {

}
