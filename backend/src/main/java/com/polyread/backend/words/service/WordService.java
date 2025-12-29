package com.polyread.backend.words.service;

import com.polyread.backend.words.WordRepository;
import com.polyread.backend.words.domain.Word;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Service for word operations.
 */
@Service
public final class WordService {
    /**
     * Repository for word data access.
     */
    private final WordRepository wordRepository;

    /**
     * Constructor for WordService.
     *
     * @param repository the word repository
     */
    public WordService(final WordRepository repository) {
        this.wordRepository = repository;
    }

    /**
     * Get all words.
     *
     * @return list of all words
     */
    public List<Word> getAllWords() {
        return wordRepository.findAll();
    }
}
