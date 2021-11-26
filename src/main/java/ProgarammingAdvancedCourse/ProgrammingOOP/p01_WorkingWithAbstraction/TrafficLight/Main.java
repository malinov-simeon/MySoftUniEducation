package TrafficLight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lights = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            lights = changeLights(lights);
            System.out.println(String.join(" ", lights));
        }
    }

    public static String[] changeLights(String[] lights) {
        for (int i = 0; i < lights.length; i++) {
            switch (lights[i]) {
                case "RED":
                    lights[i] = "GREEN";
                    break;
                case "YELLOW":
                    lights[i] = "RED";
                    break;
                case "GREEN":
                    lights[i] = "YELLOW";
                    break;
            }
        }
        return lights;
    }
}
