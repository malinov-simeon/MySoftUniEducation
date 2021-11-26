import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> chat = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split("\\s+")[0];
            String message = input.split("\\s+")[1];
            int index = chat.indexOf(message);
            switch (command) {
                case "Chat":
                    chat.add(message);
                    break;
                case "Delete":
                    chat.remove(message);
                    break;
                case "Edit":
                    String editedMessage = input.split("\\s+")[2];
                    chat.set(index,editedMessage);
                    break;
                case "Pin":
                    if (chat.contains(message)) {
                        chat.remove(message);
                        chat.add(message);
                    }
                    break;
                case "Spam":
                    String [] spam = input.split("\\s+");
                    chat.addAll(Arrays.asList(spam).subList(1, spam.length));
                    break;
            }
            input = scanner.nextLine();
        }
        for (String s : chat) {
            System.out.println(s);
        }
    }
}
