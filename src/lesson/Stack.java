package lesson;

public class Stack {

    char[] items;
    int top;

    /**
     * размещение в стеке
     */

    public void push(char item) {
        if (top == items.length - 1) {
            throw new RuntimeException("Стек переполнен!");
        }
        top++;
        items[top] = item;
        //items[++top] = item;
    }

    public char pop() {
        if (top == -1) {
            throw new RuntimeException("Стек пуст!");
        }
        return items[top--];
    }

    public Stack(int size) {
        top = -1;
        items = new char[size];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
