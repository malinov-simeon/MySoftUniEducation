package p04_InterfacesAndAbstraction.CollectionHierarchy;

import p04_InterfacesAndAbstraction.CollectionHierarchy.Classes.AddCollection;
import p04_InterfacesAndAbstraction.CollectionHierarchy.Classes.AddRemoveCollection;
import p04_InterfacesAndAbstraction.CollectionHierarchy.Classes.MyListImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemovableCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        String[] addElements = scanner.nextLine().split("\\s+");

        Arrays.stream(addElements).forEach(e -> System.out.print(addCollection.add(e) + " "));
        System.out.println();
        Arrays.stream(addElements).forEach(e -> System.out.print(addRemovableCollection.add(e) + " "));
        System.out.println();
        Arrays.stream(addElements).forEach(e -> System.out.print(myList.add(e) + " "));

        int removeOperations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < removeOperations; i++) {
            System.out.print(addRemovableCollection.remove() + " ");
        }
        System.out.println();
        for (int i = 0; i < removeOperations; i++) {
            System.out.print(myList.remove() + " ");
        }
    }
}
