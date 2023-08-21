package com.freelanceapp.services;

import com.freelanceapp.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User saveUser(User user);

    void deleteUser(Long id);

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

    UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;
}

