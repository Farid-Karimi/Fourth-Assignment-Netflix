package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

class NetflixService {

    private ArrayList<Movie> movieList;
    private ArrayList<TVShow> tvShowList;
    private HashMap<String,User> userList;
    private User currentUser;

    public NetflixService() {
        this.movieList = new ArrayList<>();
        this.tvShowList = new ArrayList<>();
        this.userList = new HashMap<>();
        this.currentUser = null;
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

    public void setCurrentUser(User user) {
        currentUser = user;
    }


    public void addTVShow(TVShow tvShow){
        tvShowList.add(tvShow);
    }

    public void addMovie(Movie movie){
        movieList.add(movie);
    }

    public User createAccount(String username, String password) {
        if(!userList.containsKey(username)) {
            User user = new User(username , password);
            userList.put(username , user);
            return user;
        }
        return null;
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
        currentUser = null;
    }

    public ArrayList<TVShow> searchByTitle(String title){
        ArrayList<TVShow> list = new ArrayList<>();
        for(TVShow show : tvShowList){
            if(show.getTitle().contains(title)){
                list.add(show);
            }
        }
        for(TVShow show : movieList){
            if(show.getTitle().contains(title)){
                list.add(show);
            }
        }
        return list;
    }
    public TVShow searchForTitle(String title){
        for(TVShow show : tvShowList){
            if(title.equals(show.getTitle())){
                return show;
            }
        }
        for(TVShow show : movieList){
            if(title.equals(show.getTitle())){
                return show;
            }
        }
        return null;
    }
    public ArrayList<TVShow> searchByGenre(String genre){
        ArrayList<TVShow> list = new ArrayList<>();
        for(TVShow show : tvShowList){
            if(show.getGenre().contains(genre)){
                list.add(show);
            }
        }
        for(TVShow show : movieList){
            if(show.getGenre().contains(genre)){
                list.add(show);
            }
        }
        return list;
    }
    public ArrayList<TVShow> searchByReleaseYear(int year) {
        ArrayList<TVShow> list = new ArrayList<>();
        for(TVShow show : tvShowList){
            if(show.getReleaseYear() == year){
                list.add(show);
            }
        }
        for(TVShow show : movieList){
            if(show.getReleaseYear() == year){
                list.add(show);
            }
        }
        return list;
    }


}

