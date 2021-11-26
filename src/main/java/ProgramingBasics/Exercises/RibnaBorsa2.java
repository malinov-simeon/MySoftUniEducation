import java.util.Scanner;

public class RibnaBorsa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Skumriq = Double.parseDouble(scanner.nextLine());

        double Caca = Double.parseDouble(scanner.nextLine());

        double Palamud = Skumriq + (Skumriq*0.6) ;
        double palamud = Palamud * Double.parseDouble(scanner.nextLine());

        double Safrid = Caca + Caca*0.8;
        double safrid = Safrid * Double.parseDouble(scanner.nextLine());

        double Midi = Double.parseDouble(scanner.nextLine()) *7.50;


        System.out.printf("%.2f",Midi+palamud+safrid);
    }
}
