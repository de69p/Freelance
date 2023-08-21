package com.freelanceapp.repositories;

import com.freelanceapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Finds a user by their email.
     *
     * @param  email  the email of the user to find
     * @return        an optional user object if found, empty otherwise
     */
    Optional<User> findByEmail(String email);

    /**
     * Checks if a user exists by their email address.
     *
     * @param  email  the email address of the user
     * @return        true if a user with the given email exists, false otherwise
     */

    boolean existsByEmail(String email);
}
