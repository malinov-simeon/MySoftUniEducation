import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String value1 = scanner.nextLine();
        String value2 = scanner.nextLine();

        // Да се преобразуват 3 мерни единици - мм, см, м

        if (value1.equals("mm")) {
            double numberCm = number / 10;
            double numberM = numberCm / 100;
            if (value2.equals("cm")) {
                System.out.printf("%.3f",numberCm);
            } else if (value2.equals("m")) {
                System.out.printf("%.3f",numberM);
            }
        }else if (value1.equals("cm")) {
            double numberMm = number * 10;
            double numberM = number / 100;
            if (value2.equals("mm")) {
                System.out.printf("%.3f",numberMm);
            } else if (value2.equals("m")) {
                System.out.printf("%.3f",numberM);
            }

        }else if (value1.equals("m")) {
            double numberMm = number * 1000;
            double numberCm = number * 100;
            if (value2.equals("mm")) {
                System.out.printf("%.3f",numberMm);
            } else if (value2.equals("cm")) {
                System.out.printf("%.3f",numberCm);
            }

        }
    }
}
