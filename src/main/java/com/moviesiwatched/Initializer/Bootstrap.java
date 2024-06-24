package com.moviesiwatched.Initializer;

import com.moviesiwatched.Repository.MoviesRepository;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap {

    private final InitializationService initializationService;

    private static final Logger logger = LoggerFactory.getLogger(Bootstrap.class);

    public Bootstrap(InitializationService initializationService) {
        this.initializationService = initializationService;
    }


    @PostConstruct
    public void init() {
        try {
            initializationService.initMovies();
        } catch (RuntimeException e) {
            logger.error("Error during initialization", e);
        }
    }

    public InitializationService getInitializationService() {
        return initializationService;
    }
}
