import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicInteger;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\user\\IdeaProjects\\StreamsFilelAndDirectorys\\inputLineNumbers.txt";
        FileWriter writer = new FileWriter("output_NumberLines.txt");
        AtomicInteger count = new AtomicInteger(1);
        Files.readAllLines(Path.of(path))
                .stream()
                .forEach(l -> {
                    try {
                        writer.write(count + ". " + l);
                        writer.write(System.lineSeparator());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    count.getAndIncrement();
                });
        writer.close();
    }
}
