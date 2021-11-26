package AdvertisementMessage;

public class AdvertisementMessage {
    String phrases;
    String events;
    String author;
    String city;

    public AdvertisementMessage(String phrases, String events, String author, String city) {
        this.phrases = phrases;
        this.events = events;
        this.author = author;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s - %s", phrases, events, author, city);
    }
}
