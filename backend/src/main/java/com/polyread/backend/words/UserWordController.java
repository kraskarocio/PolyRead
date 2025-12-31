package com.polyread.backend.words;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * REST controller for word operations.
 */
@RestController
@RequestMapping("/api/user-words")
public final class UserWordController {
    /**
     * Service for word operations.
     */
    private final UserWordService userWordService;

    /**
     * Constructor for WordController.
     *
     * @param service the word service
     */
    public UserWordController(final UserWordService service) {
        this.userWordService = service;
    }

    /**
     * Get all words.
     *
     * @return list of all words
     */
    @GetMapping
    public List<UserWord> getAllWords() {
        return userWordService.getAllWords();
    }

    /**
     * Add a new word.
     *
     * @param word the word to add
     * @return the added word
     */
    @PostMapping
    public UserWord addWord(@RequestBody final UserWord word) {
        return userWordService.addWord(word);
    }
}
