package p06_reflection.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);

        Class<BlackBoxInt> blackBoxIntClass = BlackBoxInt.class;

        Constructor<BlackBoxInt> constructor = blackBoxIntClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        BlackBoxInt blackBoxInt = constructor.newInstance();

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String methodName = command.split("_")[0];
            int value = Integer.parseInt(command.split("_")[1]);

            Method declaredMethod = blackBoxIntClass.getDeclaredMethod(methodName, int.class);
            declaredMethod.setAccessible(true);

            declaredMethod.invoke(blackBoxInt,value);

            Field innerValueField = blackBoxInt.getClass().getDeclaredField("innerValue");
            innerValueField.setAccessible(true);

            int valueInt = (int) innerValueField.get(blackBoxInt);
            System.out.println(valueInt);

            command = scanner.nextLine();
        }
    }
}
