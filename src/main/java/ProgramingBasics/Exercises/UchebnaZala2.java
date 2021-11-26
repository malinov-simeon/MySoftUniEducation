import java.util.Scanner;

public class UchebnaZala2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = Double.parseDouble(scanner.nextLine()) * 100;
        double w = (Double.parseDouble(scanner.nextLine())-1) * 100 ;

     int rows = (int) (h/120);
     int columns = (int) (w/70);

     int seats = rows * columns - 3 ;

     System.out.println(seats);
    }
}
