package OpinionPool;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<OpinionPool> opinionPools = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String [] personData = scanner.nextLine().split("\\s+");
            int age = Integer.parseInt(personData[1]);
            String name = personData[0];

            OpinionPool newOpinion = new OpinionPool(age, name);
            opinionPools.add(newOpinion);
        }

        opinionPools = opinionPools.stream().filter(opinionPool -> opinionPool.getAge() > 30).collect(Collectors.toList());

        opinionPools.sort(Comparator.comparing(OpinionPool::getName));

        for (OpinionPool opinionPool : opinionPools) {
            System.out.println(opinionPool.toString());
        }
    }
}
