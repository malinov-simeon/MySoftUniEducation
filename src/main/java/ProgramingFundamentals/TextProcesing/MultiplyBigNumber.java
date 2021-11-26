import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bigNumber = scanner.nextLine();
        int smallNumber = Integer.parseInt(scanner.nextLine());
        StringBuilder sum = new StringBuilder();
        int multiply = 0;
        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            int currentNumber = Integer.parseInt(bigNumber.charAt(i) + "");
            multiply = smallNumber * currentNumber;
            String getNumber = multiply % 10 + "";
            sum.insert(0, getNumber);
        }
        System.out.println(sum);
    }
}
