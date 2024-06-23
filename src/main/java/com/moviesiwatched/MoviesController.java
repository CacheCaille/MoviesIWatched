package com.moviesiwatched;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {

    @RequestMapping("/api/test")
    public String testUsage() {
        return "test";
    }
}
