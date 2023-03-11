package org.example;

import java.util.ArrayList;

class Movie extends TVShow {
    private int lengthMinute;

    public Movie(String title, String genre, String releaseYear, int durationMinute, double rating, ArrayList<String> castMember, int lengthMinute) {
        super(title, genre, releaseYear, durationMinute, rating, castMember);
        this.lengthMinute = lengthMinute;
    }

    public int getLengthMinute() {
        return lengthMinute;
    }

    public void setLengthMinute(int lengthMinute) {
        this.lengthMinute = lengthMinute;
    }

}


