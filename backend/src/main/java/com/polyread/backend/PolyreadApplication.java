package com.polyread.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for PolyRead.
 */
@SpringBootApplication
public final class PolyreadApplication {

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private PolyreadApplication() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Main method to start the Spring Boot application.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(PolyreadApplication.class, args);
    }

}
