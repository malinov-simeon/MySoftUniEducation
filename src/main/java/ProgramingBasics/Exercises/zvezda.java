import java.util.Scanner;

public class zvezda {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Въведете колко голяма да бъде страната на квадрата!");
        int sqside = Integer.parseInt(console.nextLine());
        String full = "*".repeat(sqside);
        String str = " ".repeat(sqside-2);
        System.out.println(full);
        //System.out.println();
        for (int i=0 ; i<sqside-2; i++) {
            System.out.print("*");
            System.out.print(str);
            System.out.println("*");
        }
        System.out.println(full);
    }
}