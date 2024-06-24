package com.moviesiwatched.Service;

import com.moviesiwatched.Initializer.Bootstrap;
import com.moviesiwatched.Initializer.InitializationService;
import com.moviesiwatched.Model.Movies;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

@SpringBootTest
class MoviesServiceIntegrationTest {

    @Autowired
    private MoviesService moviesService;

    @Autowired
    private Bootstrap bootstrap;

    @Test
    public void testFindAllMoviesFromInitialization() {
        // Given the initialization service of the bootstrap component
        bootstrap.getInitializationService();

        // When searching for all movies
        List<Movies> movies = moviesService.getAllMovies();

        // Then 2 movies are fetched
        assertEquals(2, movies.size());
    }
}