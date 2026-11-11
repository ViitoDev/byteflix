package byteflix;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.name = "Avengers: Endgame";
        movie1.releaseYear = 2019;

        movie1.showMovie();
        movie1.avaluate(10);
        movie1.avaluate(5);

        System.out.println(movie1.showRatingMedia());
    }
}