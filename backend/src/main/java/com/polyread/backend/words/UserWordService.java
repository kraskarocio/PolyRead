package com.polyread.backend.words;

import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Service for word operations.
 */
@Service
public final class UserWordService {
    /**
     * Repository for word data access.
     */
    private final UserWordRepository userWordRepository;
    /**
     * Constructor for WordService.
     *
     * @param repository the word repository
     */
    public UserWordService(final UserWordRepository repository) {
        this.userWordRepository = repository;
    }

    /**
     * Get all words.
     *
     * @return list of all words
     */
    public List<UserWord> getAllWords() {
        return userWordRepository.findAll();
    }

    /**
     * Add a new word.
     *
     * @param word the word to add
     * @return the saved word
     */
    public UserWord addWord(final UserWord word) {
        return userWordRepository.save(word);
    }
}
