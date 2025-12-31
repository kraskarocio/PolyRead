package com.polyread.backend.user;

import com.polyread.backend.words.UserWord;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Service for user operations.
 */
@Service
public final class UserService {
    /**
     * Repository for user data access.
     */
    private final UserRepository userRepository;

    /**
     * Constructor for UserService.
     *
     * @param repo the user repository
     */
    public UserService(final UserRepository repo) {
        this.userRepository = repo;
    }
    /**
     * Get a user by ID.
     *
     * @param id the user ID
     * @return the user with the specified ID
     * @throws RuntimeException if user is not found
     */
    public User getUserById(final Long id) {
        return userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found"));
    }
    /**
     * Get all words for a user.
     *
     * @param userId the user ID
     * @return list of words for the user
     */
    public List<UserWord> getUserWords(final Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        return user != null ? user.getWords() : List.of();
    }
    /**
     * Get a user by username.
     *
     * @param username the username to search for
     * @return the user with the specified username
     */
    public User getUserByUsername(final String username) {
        return userRepository.findByUsername(username);
    }
    /**
     * Create a new user.
     *
     * @param user the user to create
     * @return the created user
     */
    public User createUser(final User user) {
        return userRepository.save(user);
    }
    /**
     * Delete a user by ID.
     *
     * @param id the user ID
     */
    public void deleteUser(final Long id) {
        userRepository.deleteById(id);
    }
}
