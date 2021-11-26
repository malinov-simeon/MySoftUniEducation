import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicLong;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        AtomicLong totalSum = new AtomicLong();
        PrintWriter writer = new PrintWriter("output_capitals.txt");

        Files.readAllLines(Path.of(path))
                .stream()
                .map(s -> s.split("//s+"))
                .forEach(a -> {
                    for (int i = 0; i < a.length; i++) {
                        a[i] = a[i].toUpperCase();
                    }
                    writer.write(String.join(" ", a));
                    writer.write(System.lineSeparator());
                });
        writer.close();
    }
}
