package com.spring.boot.restAPI.Spring_Boot_Funamental.MovieRecommendation;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController

// Try to say it is controller Class for services. To Inform Spring. RestController is used for making restful web
// services with the help of the @RestController annotation. This annotation is used at the class level and allows
// the class to handle the requests made by the client. Let’s understand @RestController annotation using an example.
// The RestController allows to handle all REST APIs such as GET, POST, Delete, PUT requests.


public class RecommendationsController
{
    @GetMapping("/Movies")

    public List<Movie> getAllMovies()
    {
        return Arrays.asList(
                new Movie(1,"John Wick I", 9),
                new Movie(2,"John Wick II", 10),
                new Movie(3,"John Wick III", 9.9),
                new Movie(4,"John Wick IV", 9.5)
        );
    }
}
