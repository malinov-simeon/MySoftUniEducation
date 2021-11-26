package p03_Encapsulation.FootballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, Team> teams = new LinkedHashMap<>();

        while (!command.equals("END")) {
            String[] commandArray = command.split(";");
            String commandType = commandArray[0];
            String teamName = commandArray[1];
            boolean validTeam = teams.containsKey(teamName);
            switch (commandType) {

                case "Team":
                    Team team = new Team(teamName);
                    teams.put(teamName, team);
                    break;

                case "Add":
                    String addPlayerName = commandArray[2];
                    int endurance = Integer.parseInt(commandArray[3]);
                    int sprint = Integer.parseInt(commandArray[4]);
                    int dribble = Integer.parseInt(commandArray[5]);
                    int passing = Integer.parseInt(commandArray[6]);
                    int shooting = Integer.parseInt(commandArray[7]);
                    if (validTeam) {
                        try {
                            Player player = new Player(addPlayerName, endurance, sprint, dribble, passing, shooting);
                            teams.get(teamName).addPlayer(player);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        message(teamName);
                    }
                    break;

                case "Remove":
                    String removePlayerName = commandArray[2];
                    try {
                        teams.get(teamName).removePlayer(removePlayerName);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "Rating":
                    if (validTeam) {
                        System.out.printf("%s - %.0f", teamName, teams.get(teamName).getRating());
                    } else {
                        message(teamName);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }

    private static void message(String teamName) {
        System.out.printf("Team %s does not exist.%n", teamName);
    }
}
