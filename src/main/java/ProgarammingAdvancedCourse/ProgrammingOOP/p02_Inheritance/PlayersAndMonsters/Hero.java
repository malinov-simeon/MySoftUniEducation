package p02_Inheritance.PlayersAndMonsters;

public class Hero {
    private String username;
    private int level;

    public Hero(String username, int level) {
        this.username = username;
        this.level = level;
    }

    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %d",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());

    }

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }
}
