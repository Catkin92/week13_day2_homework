package com.codeclan.example.relationshipsHomework.components;

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

    }
}
