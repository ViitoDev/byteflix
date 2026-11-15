package byteflix;

import byteflix.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setName("Avengers: Endgame");
        movie1.setReleaseYear(2019);
        movie1.avaluate(10);
        movie1.avaluate(5);

        movie1.showMovie();
        System.out.println("Average rating: " + movie1.showRatingMedia());
        System.out.println("Total ratings: " + movie1.getTotalRating());
    }
}