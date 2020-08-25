package lesson;

public class StackGeneric<T> implements PushPop<T> {
    T[] items;
    int top;

    public StackGeneric(T[] items) {
        top = -1;
        this.items = items;
    }

    public void push(T item) {
        if (top == items.length - 1) {
            throw new RuntimeException("Стек переполнен!");
        }
        top++;
        items[top] = item;
        //items[++top] = item;
    }

    public T pop() {
        if (top == -1) {
            throw new RuntimeException("Стек пуст!");
        }
        return items[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
