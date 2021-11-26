import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class MergedTwoTexts {
    public static void main(String[] args) throws IOException {
        String text1Path = "inputOne.txt";
        String text2Path = "inputTwo.txt";
        PrintWriter writer = new PrintWriter("output_mergedTexts.txt");

        Files.readAllLines(Path.of(text1Path))
                .forEach(writer::println);
        Files.readAllLines(Path.of(text2Path))
                .forEach(writer::println);

        writer.close();
    }
}
