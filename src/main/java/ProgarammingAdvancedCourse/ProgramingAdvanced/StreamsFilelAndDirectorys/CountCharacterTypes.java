import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicInteger;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        AtomicInteger vowels = new AtomicInteger();
        AtomicInteger consonant = new AtomicInteger();
        AtomicInteger punctuation = new AtomicInteger();
        PrintWriter writer = new PrintWriter("output_charactersCount.txt");
        Files.readAllLines(Path.of(path))
                .stream()
                .map(String::toCharArray)
                .forEach(l -> {
                    for (int i = 0; i < l.length; i++) {
                        char current = l[i];
                        //⦁	a, e, i, o, u
                        if (current == 'a' || current == 'e' || current == 'o' || current == 'i' || current == 'u') {
                            vowels.getAndIncrement();
                        } else if (current == ' ') {
                            continue;
                        } else if (current == ',' || current == '.' || current == '?' || current == '!') {
                            punctuation.getAndIncrement();
                        } else {
                            consonant.getAndIncrement();
                        }
                    }
                });
        writer.write("Vowels: " + vowels);
        writer.write(System.lineSeparator());
        writer.write("Consonants: " + consonant);
        writer.write(System.lineSeparator());
        writer.write("Punctuation: " + punctuation);
        writer.write(System.lineSeparator());
        writer.close();
    }
}
