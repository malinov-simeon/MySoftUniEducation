package SumBigNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigInteger = new BigInteger(scanner.nextLine());
        BigInteger bigInteger2 = new BigInteger(scanner.nextLine());
        BigInteger sum = bigInteger.add(bigInteger2);
        System.out.println(sum);
    }
}
