package com.codeclan.example.relationshipsHomework.components;

import com.codeclan.example.relationshipsHomework.models.File;
import com.codeclan.example.relationshipsHomework.models.Folder;
import com.codeclan.example.relationshipsHomework.models.User;
import com.codeclan.example.relationshipsHomework.repositories.FileRepository;
import com.codeclan.example.relationshipsHomework.repositories.FolderRepository;
import com.codeclan.example.relationshipsHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        User user1 = new User("Max");
        userRepository.save(user1);

        Folder folder1 = new Folder("Mad Max", user1);
        folderRepository.save(folder1);

        File file1 = new File("Thunderdome", "ppt", 30, folder1);
        fileRepository.save(file1);

        File file2 = new File("Fury Road", "ppt", 25, folder1);
        fileRepository.save(file2);
    }
}
