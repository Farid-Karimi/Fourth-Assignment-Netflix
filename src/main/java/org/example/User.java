package org.example;

import java.util.ArrayList;


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

    public ArrayList<TVShow> getFavouriteShows(){
        return favouriteShows;
    }

    public void setFavouriteShows(ArrayList<TVShow> favouriteShows) {
        this.favouriteShows = favouriteShows;
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
            if(show.getTitle().contains(title)){
                list.add(show);
            }
        }

        return list;
    }
    public ArrayList<TVShow> searchByGenre(String genre){
        ArrayList<TVShow> list = new ArrayList<>();
        for(TVShow show : favouriteShows){
            if(show.getGenre().contains(genre)){
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
    public ArrayList<TVShow> getRecommendations(NetflixService netflix) {
        ArrayList<TVShow> recommendations = new ArrayList<>();
        for (TVShow tvShow : netflix.getTvShowList()) {
            //Check if the TV show has not been already watched
            if (!favouriteShows.contains(tvShow)) {
                //Check if the TV show has the same genre as the last watched TV show by the user
                if (favouriteShows.size() > 0 && (tvShow.getGenre().contains(favouriteShows.get(favouriteShows.size() - 1).getGenre()) || favouriteShows.get(favouriteShows.size() - 1).getGenre().contains(tvShow.getGenre()))) {
                    recommendations.add(tvShow);
                }
                //Check if the TV show has a high rating
                else if (tvShow.getRating() > 8.0) {
                    recommendations.add(tvShow);
                }
            }
        }
        return recommendations;
        
    }
}
