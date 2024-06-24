package com.moviesiwatched.Controller;

import com.moviesiwatched.Model.Movies;
import com.moviesiwatched.Service.MoviesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoviesController {

    private final MoviesService moviesService;

    public MoviesController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    @RequestMapping("/api/getAllMovies")
    public List<Movies> getAllMovies() {
        return moviesService.getAllMovies();
    }
}
