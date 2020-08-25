package lesson;

public class Queue<T> implements PushPop<T> {

    private T[] items;
    private int size;
    private int first; //первый элемент
    private int last; //последний элемент

    public Queue(T[] items) {
        this.items = items;
        size = 0; //в очередь ещё ничего не добавлено
        first = 0;
        last = -1;
    }

    public void push(T e) {
        if (size == items.length - 1) {
            throw new RuntimeException("ОЧередь переполнена!");
        }
        //если элемент добавлен в конец массива, то нужно встать в начало
        //закольцованная очередь
        if (last == items.length - 1) {
            last = -1;
        }
        items[++last] = e; //кладем элемнт
        size++; //увеличиваем размер массива
    }

    public T pop() {
        if (size == 0) {
            throw new RuntimeException("ОЧередь пустая!");
        }
        T tmp = items[first++];
        /* T tmp = items[first];
         *  first++; */
        if (first == items.length) {
            first = 0;
        }
        size--;
        return tmp;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
