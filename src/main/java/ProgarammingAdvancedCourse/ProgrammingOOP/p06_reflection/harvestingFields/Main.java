package p06_reflection.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Class<RichSoilLand> richSoilLandClass = RichSoilLand.class;
        Field[] declaredFields = richSoilLandClass.getDeclaredFields();

        String commandType = scanner.nextLine();

        while (!commandType.equals("HARVEST")) {
            printNecesseryFields(declaredFields, commandType);
            commandType = scanner.nextLine();
        }
    }

    private static void printNecesseryFields(Field[] declaredFields, String command) {
        switch (command) {
            case "private":
                Arrays.stream(declaredFields)
                        .filter(field -> Modifier.isPrivate(field.getModifiers()))
                        .forEach(field -> System.out.printf("%s %s %s%n",
                                Modifier.toString(field.getModifiers()),
                                field.getType().getSimpleName(),
                                field.getName()));
                break;
            case "public":
                Arrays.stream(declaredFields)
                        .filter(field -> Modifier.isPublic(field.getModifiers()))
                        .forEach(field -> System.out.printf("%s %s %s%n",
                                Modifier.toString(field.getModifiers()),
                                field.getType().getSimpleName(),
                                field.getName()));
                break;
            case "protected":
                Arrays.stream(declaredFields)
                        .filter(field -> Modifier.isProtected(field.getModifiers()))
                        .forEach(field -> System.out.printf("%s %s %s%n",
                                Modifier.toString(field.getModifiers()),
                                field.getType().getSimpleName(),
                                field.getName()));
                break;
            case "all":
                Arrays.stream(declaredFields)
                        .forEach(field -> System.out.printf("%s %s %s%n",
                                Modifier.toString(field.getModifiers()),
                                field.getType().getSimpleName(),
                                field.getName()));
                break;
        }
    }
}
