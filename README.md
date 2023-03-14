# Fourth-Assignment-Netflix


## Introduction
In this assignment, I created a simulation of Netflix. The program allows users to create and manage their accounts and profiles, browse movies, and manage their movies. The program is designed using object-oriented programming principles.

## Tasks
1. I implemented the methods in the `NetflixService` class and as a bonus I added some extra features to the `search` methods so that you don't have to enter the full name of a movie or a tv show , the methods return a list of all the names that contains the String that the user entered.

2. implemented methods in the `User` class and did the same thing for the `search` methods.
    the `getRecommendation` method in this class looks for your last favorite movie and recommend you similar genres and also it recommends movie and tv shows with ratings higher than `8.0`.

    ```java
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
    ```

    

3. implemented the methods in the `TVShow` class and add some methods like `addCastMember` to add cast members one-by-one.

4. inherited the `Movie` class from `TVShow` and added length of the movie.

5. wrote some test cases and movie and TV shows templates.

6. wrote this report , made the UML diagrams and pushed the code to GitHub.

## Bonus Objectives
1. Input Validation.
2. Used Hash-map to store Username and password.
3. Extended search classes to work more fluidly.

## UML Diagram

![Fourth-Assignment-Netflix](https://user-images.githubusercontent.com/118434072/224955287-a2ec7fbe-3620-4810-bbc9-b5114af28173.png)

---

### farid karimi  /  401222112
