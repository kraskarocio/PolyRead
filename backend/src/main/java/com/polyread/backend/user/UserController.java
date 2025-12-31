package com.polyread.backend.user;

import com.polyread.backend.words.UserWord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * REST controller for user operations.
 */
@RestController
@RequestMapping("/api/users")
public final class UserController {
    /**
     * Service for user operations.
     */
    private final UserService userService;

    /**
     * Constructor for UserController.
     *
     * @param service the user service
     */
    public UserController(final UserService service) {
        this.userService = service;
    }

    /**
     * Get a user by ID.
     *
     * @param id the user ID
     * @return the user with the specified ID
     */
    @GetMapping("/{id}")
    public User getUserById(@PathVariable final Long id) {
        return userService.getUserById(id);
    }

    /**
     * Get all words for a user.
     *
     * @param id the user ID
     * @return list of words for the user
     */
    @GetMapping("/{id}/words")
    public List<UserWord> getUserWords(@PathVariable final Long id) {
        return userService.getUserWords(id);
    }

    /**
     * Create a new user.
     *
     * @param user the user to create
     * @return the created user
     */
    @PostMapping
    public User createUser(@RequestBody final User user) {
        return userService.createUser(user);
    }

    /**
     * Delete a user by ID.
     *
     * @param id the user ID
     */
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable final Long id) {
        userService.deleteUser(id);
    }
}
