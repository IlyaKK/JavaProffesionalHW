package homework1;

public interface IArrayList<E> {
    void add(E value);
    void add(E value, int index);
    void remove(int index);
    E get(int index);
    boolean find(E value);
    void display();
    int getCurrentSize();
    void sort();
}