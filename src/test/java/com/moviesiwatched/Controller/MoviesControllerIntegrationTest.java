package com.moviesiwatched.Controller;

import com.moviesiwatched.Initializer.InitializationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MoviesControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

     @Autowired
    private InitializationService initializationService;

     @Test
    public void testFindAllMovies() {

         // When requesting all the movies
         String body = this.restTemplate.getForObject("/api/getAllMovies", String.class);

         // Then the result contains the 2 movies
         assertTrue(body.contains(initializationService.getMovie1().getTitle()));
         assertTrue(body.contains(initializationService.getMovie2().getTitle()));
         assertTrue(body.contains(initializationService.getMovie1().getDescription()));
         assertTrue(body.contains(initializationService.getMovie2().getDescription()));
     }

}