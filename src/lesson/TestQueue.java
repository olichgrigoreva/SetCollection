package lesson;

public class TestQueue {
    public static void main(String[] args) {
        PushPop<Character> stack = new StackGeneric<>(new Character[100]);
        PushPop<Character> queue = new Queue<>(new Character[100]);
        char[] chars = "hello world".toCharArray(); //разбили строку на массив

        System.out.print("Стек: ");
        pushPopPrint(chars, stack);
        System.out.print("Очередь: ");
        pushPopPrint(chars, queue);
    }

    private static void pushPopPrint(char[] chars, PushPop<Character> pushPop) {
        //складывает
        for (char ch : chars) {
            pushPop.push(ch);
        }
        //вытаскивает и выводит
        while (!pushPop.isEmpty()) {
            System.out.print(pushPop.pop());
        }
        System.out.println();
    }
}
