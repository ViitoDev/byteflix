package byteflix;

import byteflix.models.Movie;
import byteflix.models.Serie;
import byteflix.services.TimeCalculator;

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

        Serie serie1 = new Serie();
        serie1.setName("Lost");
        serie1.setReleaseYear(2004);
        serie1.setSeasons(6);
        serie1.setSeasonEpisodes(20);
        serie1.setMinutesPerEpisode(45);

        serie1.showMovie();
        System.out.println("Screen time to binge: " + serie1.getScreenTime() + " minutes");

        Serie serie2 = new Serie();
        serie2.setName("Breaking Bad");
        serie2.setReleaseYear(2008);
        serie2.setSeasons(5);
        serie2.setSeasonEpisodes(12);
        serie2.setMinutesPerEpisode(47);

        serie2.showMovie();
        System.out.println("Screen time to binge: " + serie2.getScreenTime() + " minutes");

        movie1.setScreenTime(181);

        TimeCalculator calculator = new TimeCalculator();
        calculator.timerInclude(movie1);
        calculator.timerInclude(serie1);
        calculator.timerInclude(serie2);
        System.out.println("Total screen time: " + calculator.getTimer() + " minutes");
    }
}