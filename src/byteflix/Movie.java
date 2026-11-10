package byteflix;

public class Movie {
    String name;
    int releaseYear;
    boolean planIncluded;
    double rating;
    int totalRating;
    int screenTime;

    void showMovie(){
        System.out.println("Movie: " + name);
        System.out.println("Release year: " + releaseYear);
    }
}
