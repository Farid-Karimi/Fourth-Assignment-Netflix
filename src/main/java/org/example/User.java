package org.example;

import java.util.ArrayList;

/*
 * The user should contain username password.
 * The user should contain an ArrayList of favorite shows and watch history.
 * FUNCTION: the user should have a function to watch a show and add it to watch history.
 *  *** NOTE: All search functions in user are for searching in favorite shows ***
 */
class User {
    private String username;
    private String password;
    private ArrayList<TVShow> favouriteShows;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.favouriteShows = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<TVShow> searchByTitle(String title){
        ArrayList<TVShow> list = new ArrayList<>();
        for(TVShow show : favouriteShows){
            if(title.contains(show.getTitle())){
                list.add(show);
            }
        }
        return list;
    }
    public ArrayList<TVShow> searchByGenre(String genre){
        ArrayList<TVShow> list = new ArrayList<>();
        for(TVShow show : favouriteShows){
            if(genre.contains(show.getGenre())){
                list.add(show);
            }
        }
        return list;
    }
    public ArrayList<TVShow> searchByReleaseYear(int year) {
        ArrayList<TVShow> list = new ArrayList<>();
        for(TVShow show : favouriteShows){
            if(show.getReleaseYear() == year){
                list.add(show);
            }
        }
        return list;
    }
    public void addToFavorites(TVShow show) {
        favouriteShows.add(show);
    }
    public void viewFavorites() {
        System.out.print("Your Favourite Shows Are:");
        System.out.println(favouriteShows);
    }
    public ArrayList<TVShow> getRecommendations() {
        ArrayList<TVShow> recommendations = new ArrayList<>();
        for (TVShow tvShow : ) {
            // Check if the TV show has not been watched by the user
            if (!favouriteShows.contains(tvShow)) {
                // Check if the TV show has the same genre as the last watched TV show by the user
                if (favouriteShows.size() > 0 && tvShow.getGenre().equals(favouriteShows.get(favouriteShows.size() - 1).getGenre())) {
                    recommendations.add(tvShow);
                }
                // Check if the TV show has a high rating
                else if (tvShow.getRating() > 8.0) {
                    recommendations.add(tvShow);
                }
            }
        }
        return recommendations;
    }
}
