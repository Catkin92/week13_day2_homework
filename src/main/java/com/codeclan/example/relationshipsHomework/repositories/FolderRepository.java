package com.codeclan.example.relationshipsHomework.repositories;

import com.codeclan.example.relationshipsHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
