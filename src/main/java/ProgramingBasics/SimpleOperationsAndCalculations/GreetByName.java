import java.util.Scanner;

public class GreetByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.printf("Hello, %s!",name);
        System.out.println();

        System.out.println("Hello, " + name + "!");
    }
}
