package com.freelanceapp.repositories;

import com.freelanceapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByEmailAndPassword(String email, String password);
    User findByEmail(String email);
}
