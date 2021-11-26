import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вход
        String type = scanner.nextLine();


        if (type.equals("square")) {
            double parameter = Double.parseDouble(scanner.nextLine());
            double area = parameter * parameter;
            System.out.printf("%f", area);
        } else if (type.equals("rectangle")) {
            double parameter = Double.parseDouble(scanner.nextLine());
            double parameter2 = Double.parseDouble(scanner.nextLine());
            double area = parameter * parameter2;
            System.out.printf("%f", area);
        } else if (type.equals("circle")) {
            double parameter = Double.parseDouble(scanner.nextLine());
            double area = parameter * Math.PI * parameter;
            System.out.printf("%f", area);
        } else if (type.equals("triangle")) {
            double parameter = Double.parseDouble(scanner.nextLine());
            double parameter2 = Double.parseDouble(scanner.nextLine());
            double area = parameter * parameter2 / 2;
            System.out.printf("%f", area);
        }

    }
}
