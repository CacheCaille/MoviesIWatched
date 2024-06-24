package com.moviesiwatched.Model;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

public class Movies {

    @Id
    public String id;

    @NotEmpty
    public String title;

    public String description;

    public Movies() {}

    public Movies(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public @NotEmpty String getTitle() {
        return title;
    }

    public void setTitle(@NotEmpty String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
