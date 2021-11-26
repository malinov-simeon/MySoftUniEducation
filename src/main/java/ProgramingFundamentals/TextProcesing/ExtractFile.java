import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        String [] pathArray = path.split("\\\\");
        int index = pathArray.length - 1;
        String file = pathArray[index];
        String fileName = file.split("\\.")[0];
        String fileExtension = file.split("\\.")[1];
        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}
