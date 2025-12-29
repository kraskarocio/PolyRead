package com.polyread.backend.words.controller;

import com.polyread.backend.words.service.WordService;
import com.polyread.backend.words.domain.Word;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.List;

/**
 * REST controller for word operations.
 */
@RestController
@RequestMapping("/api/words")
public final class WordController {
    /**
     * Service for word operations.
     */
    private final WordService wordService;

    /**
     * Constructor for WordController.
     *
     * @param service the word service
     */
    public WordController(final WordService service) {
        this.wordService = service;
    }

    /**
     * Get all words.
     *
     * @return list of all words
     */
    @GetMapping
    public List<Word> getAllWords() {
        return wordService.getAllWords();
    }

    /**
     * Add a new word.
     *
     * @param word the word to add
     * @return response entity indicating the result
     */
    @PostMapping
    public ResponseEntity<Void> addWord(@RequestBody final Word word) {
        wordService.addWord(word);
        return ResponseEntity.ok().build();
    }
}
