package com.spring.boot.restAPI.Spring_Boot_Funamental.MovieRecommendation;

import java.util.List;

public class Movie
{
    int id;
    String name;
    double rating;

    public Movie() {
        id = id;
        this.name = name;
        this.rating = rating;
    }

    public Movie(int id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }


}
