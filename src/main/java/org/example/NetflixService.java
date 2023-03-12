package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

class NetflixService {
    /*
     *The NetflixService should have an Arraylist of users, tv shows and movies.
     *The NetflixService should have a User object which represents current user.
     */
    private ArrayList<Movie> movieList;
    private ArrayList<TVShow> tvShowList;
    private HashMap<String,User> userList;
    private User currentUser;

    public NetflixService(User user) {
        this.movieList = new ArrayList<>();
        this.tvShowList = new ArrayList<>();
        this.userList = new HashMap<>();
        this.currentUser = user;
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(ArrayList<Movie> movieList) {
        this.movieList = movieList;
    }

    public ArrayList<TVShow> getTvShowList() {
        return tvShowList;
    }
    public void setTvShowList(ArrayList<TVShow> tvShowList) {
        this.tvShowList = tvShowList;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        currentUser = currentUser;
    }


    public void addTVShow(TVShow tvShow){
        tvShowList.add(tvShow);
    }

    public void addMovie(Movie movie){
        movieList.add(movie);
    }

    public void createAccount(String username, String password) {
        User user = new User(username , password);
        userList.put(username , user);
    }

    public boolean login(String username, String password) {
        if(userList.containsKey(username) && Objects.equals(userList.get(username).getPassword(), password)){
            currentUser = userList.get(username);
            return true;
        }
        else{
            return false;
        }
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

