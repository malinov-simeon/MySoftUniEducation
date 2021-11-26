import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String [] array1 = new String [n];
        String [] array2 = new String [n];

        for (int row = 0; row < n; row++) {
            String input = scanner.nextLine();
            if (row  % 2 == 0) {
                array2[row] = input.split(" ")[1];
                array1[row] = input.split(" ")[0];
            } else {
                array2[row] = input.split(" ")[0];
                array1[row] = input.split(" ")[1];
            }
        }

        for (String s : array1) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (String s : array2) {
            System.out.print(s + " ");
        }
    }
}
