package Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songList = new ArrayList<>(numberOfSongs);

        String input = scanner.nextLine();
        for (int i = 0; i < numberOfSongs; i++) {
            String type = input.split("_")[0];
            String name = input.split("_")[1];
            String time = input.split("_")[2];
            Song song = new Song(type, name, time);
            songList.add(i, song);
            input = scanner.nextLine();
        }

        for (Song song : songList) {
            if (song.getType().equals(input)) {
                System.out.println(song.getName());
            } else if (input.equals("all")) {
                System.out.println(song.getName());
            }
        }
    }
}
