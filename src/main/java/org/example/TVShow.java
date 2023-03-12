package org.example;

import java.util.ArrayList;

class TVShow{
    private String title;
    private String genre;
    private int releaseYear;
    private int durationMinute;
    private double rating;
    private ArrayList<String> castMember;

    //constructor
    public TVShow(String title, String genre, int releaseYear, int durationMinute, double rating, ArrayList<String> castMember) {

        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.durationMinute = durationMinute;
        this.rating = rating;
        this.castMember = castMember;

    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDurationMinute(int durationMinute) {
        this.durationMinute = durationMinute;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setCastMember(ArrayList<String> castMember) {
        this.castMember = castMember;
    }
    //getters
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDurationMinute() {
        return durationMinute;
    }

    public double getRating() {
        return rating;
    }

    public ArrayList<String> getCastMember() {
        return castMember;
    }
    public void addCastMember(String name){
        castMember.add(name);
    }
}
