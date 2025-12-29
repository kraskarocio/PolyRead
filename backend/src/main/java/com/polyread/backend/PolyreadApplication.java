package com.polyread.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for PolyRead.
 */
@SpringBootApplication
public class PolyreadApplication {

    /**
     * Protected constructor to satisfy Checkstyle while allowing Spring Boot
     * to instantiate this class.
     */
    protected PolyreadApplication() {
        // Constructor for Spring Boot
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
