package com.moviesiwatched.Repository;

import com.moviesiwatched.Model.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MoviesRepository extends MongoRepository<Movies, String> {

    Movies findByTitle(String title);

    List<Movies> findByTitleContaining(String title);
}
