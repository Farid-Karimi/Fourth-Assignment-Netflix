package org.example;

import java.util.ArrayList;

class NetflixService {
    /*
     *The NetflixService should have an Arraylist of users, tv shows and movies.
     *The NetflixService should have a User object which represents current user.
     */
    ArrayList<TVShow> movieList

    public void addTVShow(TVShow tvShow){
        // Implement add tv show logic here
    }

    public void addMovie(Movie movie){
        // Implement add movie logic here
    }

    public void createAccount(String username, String password) {
        // Implement create account logic here
    }

    public boolean login(String username, String password) {
        // Implement login logic here
        return false;
    }

    public void logout() {
        // Implement logout logic here
    }

    public ArrayList<TVShow> searchByTitle(String title) {
        // Implement search by title logic here
        return null;
    }

    public ArrayList<TVShow> searchByGenre(String genre) {
        // Implement search by genre logic here
        return null;
    }

    public ArrayList<TVShow> searchByReleaseYear(int year) {
        // Implement search by release year logic here
        return null;
    }


}

