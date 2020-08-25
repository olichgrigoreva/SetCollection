package lesson;

public interface PushPop<T> {
    void push(T item);

    T pop();

    boolean isEmpty();
}
