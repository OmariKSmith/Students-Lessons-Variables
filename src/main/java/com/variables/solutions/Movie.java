package com.variables.solutions;
//!                             Declare the appropriate variables for class.
//!                                 Output variable values to console,
class Movie {
    //isStreaming
    boolean isStreaming = true;
    //rating
    char rating = 'R';
    //runtime
    double runtime = 1.5;
    //views
    int views = 2000;

    public static void main(String[] args) {
        Movie movie = new Movie();
        System.out.println(movie.isStreaming + " " + movie.rating + " " + movie.runtime+ " " + movie.views);
    }
}
