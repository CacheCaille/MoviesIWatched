package com.moviesiwatched;

import com.moviesiwatched.Repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesIWatchedApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoviesIWatchedApplication.class, args);
    }

}
