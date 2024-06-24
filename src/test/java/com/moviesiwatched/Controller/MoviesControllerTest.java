package com.moviesiwatched.Controller;

import com.moviesiwatched.Service.MoviesService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
@ExtendWith(MockitoExtension.class)
class MoviesControllerTest {

    @Mock
    private MoviesService moviesService;

    private MoviesController moviesController;

    @BeforeEach
    public void setUp() {
        moviesController = new MoviesController(moviesService);
    }

    @Test
    public void testVerifyControllerDelegatesToMoviesService() {
        // When requesting all the  movies
        moviesController.getAllMovies();

        // Then the service performs the request
        verify(moviesService).getAllMovies();
    }
}