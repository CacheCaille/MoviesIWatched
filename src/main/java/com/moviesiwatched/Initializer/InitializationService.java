package com.moviesiwatched.Initializer;

import com.moviesiwatched.Model.Movies;
import com.moviesiwatched.Repository.MoviesRepository;
import org.springframework.stereotype.Service;

@Service
public class InitializationService {

    private final MoviesRepository moviesRepository;

    private Movies movie1;
    private Movies movie2;

    public InitializationService(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    public void initMovies() {
        moviesRepository.deleteAll();
        movie1 = new Movies("The Hunger Games", "Teenagers chosen at random from the 12 " +
                "districts are fated to battle to death until one is remaining");
        movie2 = new Movies("Fall Guy", "Stunt guy fell and stop being a stunt guy, afterwards " +
                "he is involved in a crime");
        moviesRepository.save(movie1);
        moviesRepository.save(movie2);
    }

    public Movies getMovie1() {
        return movie1;
    }
    public Movies getMovie2() {
        return movie2;
    }
}
