package Songs;

public class Song {
    String type;
    String name;
    String time;

    Song(String type, String name, String time) {
        this.type = type;
        this.time = time;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
