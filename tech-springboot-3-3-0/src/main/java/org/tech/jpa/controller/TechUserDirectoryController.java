package org.tech.jpa.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tech.jpa.entity.TechUserDirectory;
import org.tech.jpa.service.TechUserDirectoryService;

import java.util.List;

@RestController
@RequestMapping("/techUserDirectory")
@Tag(name = "TechUserDirectoryController")
@Slf4j
public class TechUserDirectoryController {

    @Autowired
    TechUserDirectoryService techUserDirectoryService;

    @PostMapping("/addUser")
    @Operation(summary = "addUser")
    public TechUserDirectory adduser() {
        return techUserDirectoryService.addUser();
    }

    @GetMapping("/getAllUsers")
    @Operation(summary = "getAllUsers")
    public List<TechUserDirectory> getAllUsers() {
        List<TechUserDirectory> allUsers = techUserDirectoryService.getAllUsers();
        return allUsers;
    }

    @GetMapping("/findByName")
    @Operation(summary = "findByName")
    public List<TechUserDirectory> findByNameLike(String name) {
        List<TechUserDirectory> usersByName = techUserDirectoryService.findByNameLike(name);
        return usersByName;
    }

    @GetMapping("/findByTitle")
    @Operation(summary = "findByTitle")
    public List<TechUserDirectory> findByTitle(String title) {
        List<TechUserDirectory> usersByTitle = techUserDirectoryService.findByTitle(title);
        return usersByTitle;
    }
}
