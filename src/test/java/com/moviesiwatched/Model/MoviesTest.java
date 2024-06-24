package com.moviesiwatched.Model;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MoviesTest {
    private Validator validator;
    private Movies movie;

    @BeforeEach
    public void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
        // Given a valid movie
        movie = new Movies();
        movie.setTitle("Welcome to Zombieland");
        movie.setDescription("A guide on how to kill zombies and survive the apocalypse but it's funny");
    }

    @Test
    public void testMoviesValidation() {

        // Given a valid movie with a title and a description
        // Expect a valid movie
        assertTrue(validator.validate(movie).isEmpty(), "expected no constraints violation");

        // When the movie's description is empty
        movie.setDescription("");
        // Then the movie is valid
        assertTrue(validator.validate(movie).isEmpty(), "expected no constraints violation");

        // When the movie's description is null
        movie.setDescription(null);
        // Then the movie is valid
        assertTrue(validator.validate(movie).isEmpty(), "expected no constraints violation");
    }

    @Test
    public void testMovieInvalidation() {

        // Given a valid movie with a non-empty title and description

        // When the title is empty
        movie.setTitle("");

        // Then the movie is no longer valid
        assertFalse(validator.validate(movie).isEmpty(), "expected one constraint violation");

        // When the title is null
        movie.setTitle(null);

        // Then the movie is no longer valid
        assertFalse(validator.validate(movie).isEmpty(), "expected one constraint violation");
    }


}