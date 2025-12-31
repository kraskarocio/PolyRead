package com.polyread.backend.words;

public enum States {
    /**
     * Word is new and not yet studied.
     */
    NEW,
    /**
     * Word is currently being learned.
     */
    LEARNING,
    /**
     * Word has been mastered by the user.
     */
    MASTERED,
    /**
     * Word is being reviewed by the user.
     */
    REVIEWING
}
