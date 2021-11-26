import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class GetFolderSize {
    public static void main(String[] args) {
        String path = "C:\\Users\\user\\IdeaProjects\\StreamsFilelAndDirectorys\\Exercises Resources";
        File folder = new File(path);
        Map<Integer, Integer> map = new LinkedHashMap<>();


        int folderSize = 0;
        for (File file : folder.listFiles()) {
            folderSize += file.length();
        }

        System.out.println("Folder size: " + folderSize);
    }
}
