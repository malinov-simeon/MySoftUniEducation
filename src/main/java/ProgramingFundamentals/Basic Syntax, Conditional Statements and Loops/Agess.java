import java.util.Scanner;

public class Agess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageGiven = Integer.parseInt(scanner.nextLine());

        if (ageGiven>=0 && ageGiven<=2){
            System.out.println("baby");
        } else if (ageGiven>=3 && ageGiven <=13){
            System.out.println("child");
        } else if (ageGiven>=14 && ageGiven<=19){
            System.out.println("teenager");
        } else if (ageGiven>=20 && ageGiven<=65) {
            System.out.println("adult");
        } else if (ageGiven>=66){
            System.out.println("elder");
        } else {

        }
    }
}
