public class Conditional {
    public static void main(String[] args) {
        String film = "Avengers: Endgame";
        int releaseDate = 2019;
        boolean planIncluded = false;
        String planType = "plus";

        if (planIncluded || planType.equals("plus")) {
            System.out.println("Enjoy the film!");
        }
        else {
            System.out.println("Sorry but you are not in a plan!");
        }
    }
}