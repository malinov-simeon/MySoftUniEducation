package AdvertisementMessage;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] phrases = {"Excellent product."
                , "Such a great product."
                , "I always use that product."
                , "Best product of its category."
                , "Exceptional product."
                , "I can’t live without this product."};
        String[] events = {"Now I feel good."
                , "I have succeeded with this product."
                , "Makes miracles. I am happy of the results!"
                , "I cannot believe but now I feel awesome."
                , "Try it yourself, I am very satisfied."
                , "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            int phrasesRandomIndex = rnd.nextInt(phrases.length - 1);
            int eventsRandomIndex = rnd.nextInt(events.length - 1);
            int authorsRandomIndex = rnd.nextInt(events.length - 1);
            int citiesRandomIndex = rnd.nextInt(events.length - 1);

            AdvertisementMessage advertisementMessage = new AdvertisementMessage
                    (phrases[phrasesRandomIndex]
                    , events[eventsRandomIndex]
                    , authors[authorsRandomIndex]
                    , cities[citiesRandomIndex]);

            System.out.println(advertisementMessage);
        }
    }
}
