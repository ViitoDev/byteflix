package byteflix;

import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ratingMedia = 0;
        int counter = 0;
        double rating = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your film rating: ");
            rating = scanner.nextDouble();
            counter++;
            ratingMedia += rating;
        }

        System.out.println("The rate media is : " + ratingMedia / counter);
    }
}
