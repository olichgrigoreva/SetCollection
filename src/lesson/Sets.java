package lesson;

import java.lang.reflect.Array;
import java.util.*;

public class Sets {
    public static void main(String[] args) {
        //списки без дублей!
        System.out.print("HashSet: ");
        doSomeStuffWithSet(new HashSet<>()); //в случайном порядке
        System.out.print("TreeSet: ");
        doSomeStuffWithSet(new TreeSet<>()); //в алфавитном порядке
        System.out.print("LinkedHashSet: ");
        doSomeStuffWithSet(new LinkedHashSet<>()); //в порядке добавления

        List<String> letters = Arrays.asList("a", "b", "c", "e", "d", "b", "e", "f");
        System.out.printf("add elements of array %s to set %n", letters.toString());
        TreeSet<String> uniqueWords = new TreeSet<>();
        uniqueWords.addAll(letters);
        System.out.println(uniqueWords.toString());
    }

    public static void doSomeStuffWithSet(Set<String> set) {
        set.add("alpha");
        set.add("beta");
        set.add("gamma");
        set.add("beta");
        set.add("gamma");
        set.add("omega");
        set.add("epsilon");
        set.add("omega");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
