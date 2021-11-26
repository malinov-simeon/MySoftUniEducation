import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = Arrays.stream((scanner.nextLine().split(" ")))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] notTheEnd = command.split(" ");
            if (notTheEnd[0].equals("exchange")) {
                ints = exchange(ints, notTheEnd[1]);
            }
            else if (notTheEnd[0].equals("max")) {

                if (notTheEnd[1].equals("even")) {
                    max(notTheEnd[1], ints);
                } else if (notTheEnd[1].equals("odd")) {
                    max(notTheEnd[1], ints);
                }
            } else if (notTheEnd[0].equals("min")) {

                if (notTheEnd[1].equals("even")) {
                    min(notTheEnd[1], ints);
                } else if (notTheEnd[1].equals("odd")) {
                    min(notTheEnd[1], ints);
                }
            } else if (notTheEnd[0].equals("first")) {

                if (notTheEnd[2].equals("even")) {
                    first(notTheEnd[2], ints, notTheEnd[1]);
                } else if (notTheEnd[2].equals("odd")) {
                    first(notTheEnd[2], ints, notTheEnd[1]);
                }
            } else if (notTheEnd[0].equals("last")) {

                if (notTheEnd[2].equals("even")) {
                    last(notTheEnd[2], ints, notTheEnd[1]);
                } else if (notTheEnd[2].equals("odd")) {
                    last(notTheEnd[2], ints, notTheEnd[1]);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(ints));
    }

    private static void last(String s, int[] ints, String s1) {
        int length = Integer.parseInt(s1);

        int ints1[] = new int[length];
        int lastIntIndex = ints.length - 1;
        if (s.equals("even")) {
            for (int index = ints1.length - 1; index >= 0; index--) {
                for (int indexes = ints.length - 1; indexes >= lastIntIndex; indexes--) {
                    if (ints[indexes] % 2 == 0) {
                        ints1[index] = ints[indexes];
                        lastIntIndex = indexes;
                        break;
                    }
                }
            }
        } else if (s.equals("odd")) {
            for (int index = ints1.length - 1; index >= 0; index--) {
                for (int indexes = ints.length - 1; indexes >= lastIntIndex; indexes--) {
                    if (ints[indexes] % 2 != 0) {
                        ints1[index] = ints[indexes];
                        lastIntIndex = indexes;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(ints1));
    }

    private static void first(String s, int[] ints, String s1) {
        int length = Integer.parseInt(s1);
        if (length > ints.length - 1) {
            System.out.println("Invalid count");
            return;
        }

        int ints1[] = new int[length];
        int lastIntIndex = 0;
        if (s.equals("even")) {
            for (int index = 0; index < ints1.length; index++) {
                for (int indexes = lastIntIndex; indexes < ints.length; indexes++) {
                    if (ints[indexes] % 2 == 0) {
                        ints1[index] = ints[indexes];
                        lastIntIndex = indexes;
                        break;
                    }
                }
            }
        } else if (s.equals("odd")) {
            for (int index = 0; index < ints1.length; index++) {
                for (int indexes = lastIntIndex; indexes < ints.length; indexes++) {
                    if (ints[indexes] % 2 != 0) {
                        ints1[index] = ints[indexes];
                        lastIntIndex = indexes;
                        break;
                    }
                }
            }
        }
        for (int number:ints1) {
            if (number != 0) {
                System.out.println();
            }
        }
        System.out.println(Arrays.toString(ints1));
    }

    private static int[] exchange(int[] ints, String s) {
        int exchanges = Integer.parseInt(s);
        if (exchanges> ints.length - 1) {
            System.out.println("Invalid index");
            return ints;
        }
        for (int i = 0; i < exchanges; i++) {
            int currentNumber = ints[ints.length - 1];
            for (int j = ints.length - 1; j > 0; j--) {
                ints [j] = ints[j - 1];
            }
            ints[0] = currentNumber;
        }
        return ints;
    }

    private static void max(String evenOrOdd, int[] ints) {
        int max = Integer.MIN_VALUE;
        int maxIndex = Integer.MIN_VALUE;

        if (evenOrOdd.equals("even")) {
            for (int index = 0; index < ints.length; index++) {
                if (ints[index] % 2 == 0 && ints[index] >= max) {
                    max = ints[index];
                    maxIndex = index;
                }
            }
        } else if (evenOrOdd.equals("odd")) {
            for (int index = 0; index < ints.length; index++) {
                if (ints[index] % 2 != 0 && ints[index] >= max) {
                    max = ints[index];
                    maxIndex = index;
                }
            }
        }
        if (max == Integer.MIN_VALUE) {
            System.out.println("No matches");
            return;
        }
        System.out.println(maxIndex);
    }

    private static void min(String s, int[] ints) {
        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;

        if (s.equals("even")) {
            for (int index = 0; index < ints.length; index++) {
                if (ints[index] % 2 == 0 && ints[index] <= min) {
                    min = ints[index];
                    minIndex = index;
                }
            }
        } else if (s.equals("odd")) {
            for (int index = 0; index < ints.length; index++) {
                if (ints[index] % 2 != 0 && ints[index] <= min) {
                    min = ints[index];
                    minIndex = index;
                }
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println("No matches");
            return;
        }
        System.out.println(minIndex);
    }
}
