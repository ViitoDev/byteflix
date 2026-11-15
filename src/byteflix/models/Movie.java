package byteflix.models;

public class Movie {
    public String name;
    int releaseYear;
    boolean planIncluded;
    private double ratings;
    private int totalRating;
    int screenTime;

    public int getTotalRating() {
        return totalRating;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showMovie(){
        System.out.println("Movie: " + name);
        System.out.println("Release year: " + releaseYear);
    }

    public void avaluate(double note){
        ratings += note;
        totalRating += 1;
    }

    public double showRatingMedia (){
        return ratings / totalRating;
    }
}
