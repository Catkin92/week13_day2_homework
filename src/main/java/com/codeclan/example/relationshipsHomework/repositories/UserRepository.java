package com.codeclan.example.relationshipsHomework.repositories;

import com.codeclan.example.relationshipsHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
