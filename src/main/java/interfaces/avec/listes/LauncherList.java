package interfaces.avec.listes;

import java.util.ArrayList;
import java.util.HashSet;

public class LauncherList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");

        printItems(list);

        HashSet<String> set = new HashSet<>();
        set.add("foo");
        set.add("bar");

        printItems(set);
    }

    public static void printItems(Iterable<String> list) {
        System.out.println("Liste des éléments: ");
        for (String item: list) {
            System.out.println(item);
        }
    }
}
