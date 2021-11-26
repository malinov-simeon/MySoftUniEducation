import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ime = scanner.nextLine();
        int numProj = Integer.parseInt(scanner.nextLine());
        int time = numProj * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",ime,time,numProj);
    }
}
