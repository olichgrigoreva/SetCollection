package lesson;

public class ReverseWord {
    public static void main(String[] args) {
        //Stack stack = new Stack(100);
        StackGeneric<Character> stack = new StackGeneric<>(new Character[100]); //с использованием дженериков
        String string = "hello world";
        System.out.println(string);
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
