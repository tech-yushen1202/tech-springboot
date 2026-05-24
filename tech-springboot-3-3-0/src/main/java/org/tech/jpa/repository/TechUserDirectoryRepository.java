package org.tech.jpa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tech.jpa.entity.TechUserDirectory;

import java.util.List;

@Repository
public interface TechUserDirectoryRepository extends BaseRepository<TechUserDirectory, Long> {

    List<TechUserDirectory> findByNameLike(String name);

    @Query(value = "select * from TECH_USER_DIRECTORY where title=:title",nativeQuery = true)
    List<TechUserDirectory> findByTitle(@Param(value = "title") String title);

}
