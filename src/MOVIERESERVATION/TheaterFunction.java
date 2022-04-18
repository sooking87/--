package MOVIERESERVATION;

import java.util.HashMap;

public class TheaterFunction {
    public void showMovieList(HashMap<Integer, Movie> movieList) throws NoSetMoviesException {
        if (movieList.size() == 0) {
            throw new NoSetMoviesException();
        } else {
            System.out.println("This is a list of movies currently showing.");
            for (int i = 1; i <= movieList.size(); i++) {

                System.out.print(i + ". ");
                movieList.get(i).showMovieInfo();
            }
            System.out.println();
        }
    }
}
