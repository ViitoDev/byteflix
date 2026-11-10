package byteflix;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.name = "Avengers: Endgame";
        movie1.releaseYear = 2019;

        System.out.println(movie1.name);
        System.out.println(movie1.releaseYear);
    }
}