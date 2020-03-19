package interfaces.sans.listes;

import java.util.ArrayList;
import java.util.HashSet;

public class LauncherList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");

        printArrayListItems(list);


        HashSet<String> set = new HashSet<>();
        set.add("foo");
        set.add("bar");

        // ne compile pas !
        // printArrayListItems(set);

        // obligé d'écrire une autre méthode, spécifique aux "HashSets" :-(
        printSetItems(set);
    }

    /**
     * Affiche le contenu, mais spécifique aux ArrayList
     */
    public static void printArrayListItems(ArrayList<String> list) {
        System.out.println("Liste des éléments: ");
        for (String item: list) {
            System.out.println(item);
        }
    }

    /**
     * Affiche le contenu, mais spécifique aux HashSet
     */
    public static void printSetItems(HashSet<String> set) {
        System.out.println("Liste des éléments: ");
        for (String item: set) {
            System.out.println(item);
        }
    }
}
