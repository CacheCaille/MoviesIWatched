package com.moviesiwatched.Service;

import com.moviesiwatched.Model.Movies;
import com.moviesiwatched.Repository.MoviesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {

    private final MoviesRepository moviesRepository;


    public MoviesService(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    public List<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }
}
