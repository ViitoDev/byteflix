package byteflix;

public class Movie {
    String name;
    int releaseYear;
    boolean planIncluded;
    double ratings;
    int totalRating;
    int screenTime;

    void showMovie(){
        System.out.println("Movie: " + name);
        System.out.println("Release year: " + releaseYear);
    }

    void avaluate(double note){
        ratings += note;
        totalRating += 1;
    }

    double showRatingMedia (){
        return ratings / totalRating;
    }
}
