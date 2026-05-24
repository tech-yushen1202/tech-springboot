package org.tech.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tech.jpa.entity.TechUserDirectory;
import org.tech.jpa.enums.DeptEnum;
import org.tech.jpa.repository.TechUserDirectoryRepository;

import java.util.List;
import java.util.Random;

@Service
public class TechUserDirectoryServiceImpl implements TechUserDirectoryService {

    @Autowired
    TechUserDirectoryRepository techUserDirectoryRepository;

    public TechUserDirectory addUser() {
        TechUserDirectory techUserDirectory = TechUserDirectory.builder().name("Jack_" + new Random().nextInt())
                .dept(DeptEnum.TECH_DEPT)
                .title("Manager")
                .email("test@hotmail.com")
                .country("China")
                .employeeId(new Random().nextInt() + "")
                .isActive(true).
                build();
        return techUserDirectoryRepository.save(techUserDirectory);
    }

    public List<TechUserDirectory> getAllUsers() {
        return techUserDirectoryRepository.findAll();
    }

    public List<TechUserDirectory> findByNameLike(String name) {
        return techUserDirectoryRepository.findByNameLike(name);
    }

    public List<TechUserDirectory> findByTitle(String title) {
        return techUserDirectoryRepository.findByTitle(title);
    }
}
