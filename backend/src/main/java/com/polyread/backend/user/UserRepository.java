package com.polyread.backend.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * Find a user by username.
     *
     * @param username the username to search for
     * @return the user with the specified username, or null if not found
     */
    User findByUsername(String username);
}
