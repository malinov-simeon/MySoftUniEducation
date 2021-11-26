import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вход
        double income = Double.parseDouble(scanner.nextLine());
        double results = Double.parseDouble(scanner.nextLine());
        double minimumWage = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0; //minimumWage * 0.35
        double excellentScholarship = 0; //results * 25
        //1 ДАЛИ доходът е по малко от минималния доход и ДАЛИ резултата по голям ли е от 5.5, Да -> има право на две стипендии. Коя е по голяма?
        //2 Дали доходът е по малко от минималния и резултата е по голям или е 4.5. Дали дохода е по малко от 5.5

        if (results >= 5.5) {
            excellentScholarship = results * 25;
        }
        if (income < minimumWage) {
            if (results > 4.5) {
                socialScholarship = minimumWage * 0.35;
            }
        }
        if (excellentScholarship >= socialScholarship) {
            System.out.printf("Yes you get scholarship for excellent result %.0f BGN", Math.floor(excellentScholarship));

        } else if (excellentScholarship < socialScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));

        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}