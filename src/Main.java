public class Main {
    public static void main(String[] args) {
        System.out.printf("Welcome to ByteFlix\n");

        String film = "Avengers: Endgame";
        int releaseDate = 2019;
        boolean planIncluded = true;
        double filmRate1 = 0;
        double filmRate2 = 10;
        double media = (filmRate1 + filmRate2) / 2;
        String synopsis = """
                          Synopsis : 
                          After Thanos, an intergalactic warlord, disintegrates half of the universe, the Avengers must 
                          reunite and assemble again to reinvigorate their trounced allies and restore balance.
                          """;

        System.out.println(synopsis);
        System.out.println((int)media);
    }
}