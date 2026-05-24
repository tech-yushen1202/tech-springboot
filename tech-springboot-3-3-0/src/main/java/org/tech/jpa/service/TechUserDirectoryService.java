package org.tech.jpa.service;

import org.tech.jpa.entity.TechUserDirectory;

import java.util.List;

public interface TechUserDirectoryService {

    public TechUserDirectory addUser();
    public List<TechUserDirectory> getAllUsers();
    public List<TechUserDirectory> findByNameLike(String name);
    public List<TechUserDirectory> findByTitle(String title);
}
