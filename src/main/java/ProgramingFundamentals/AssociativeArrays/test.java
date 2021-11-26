import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {
        Map<String, List<String>> courses = new TreeMap<>();
        courses.put("jf", new ArrayList<>(){{
            add("Pesho");
            add("Gosho");
        }});
        courses.get("jf").add("Simo");
        System.out.println(courses.get("jf"));
    }
}
