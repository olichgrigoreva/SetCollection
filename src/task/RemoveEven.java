package task;

import java.util.*;

public class RemoveEven {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude");
        Set<String> set = new HashSet<>(list);
        System.out.println("Исходное множество: " + set.toString());
        RemoveEven removeEven = new RemoveEven();
        System.out.println("Итоговое множество: " + removeEven.removeEvenLength(set));

    }

    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> newSet = new HashSet<>();
        Iterator<String> it = set.iterator();
        int nextSize;
        String nextWord;
        while (it.hasNext()) {
            nextWord = it.next();
            nextSize = nextWord.length();
            if (nextSize % 2 != 0) {
                newSet.add(nextWord);
            }
        }
        return newSet;
    }
}
