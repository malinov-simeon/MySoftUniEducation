import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String wordsPath = "words.txt";
        String textPath = "text.txt";
        Map<String ,Integer> wordsCount = new LinkedHashMap<>();
        List<String> lines = Files.readAllLines(Path.of(wordsPath));
        for (String line: lines) {
            Arrays.stream(line.split("\\s+")).forEach(
                    word -> wordsCount.put(word, 0)
            );
        }
        for (String line: Files.readAllLines(Path.of(textPath))) {
            Arrays.stream(line.split("\\s+")).forEach(
                    word ->
                    {
                        if(wordsCount.containsKey(word)) {
                            wordsCount.put(word, wordsCount.get(word) + 1);
                        }
                    }
            );
        }
        FileWriter writer = new FileWriter("result.txt");
        wordsCount.entrySet().forEach(e -> {
            try {
                writer.write(e.getKey() + " - " + e.getValue());
                writer.write(System.lineSeparator());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        writer.close();
    }
}
