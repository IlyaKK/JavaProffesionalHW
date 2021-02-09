package homework1;

import java.io.Serializable;
import java.util.Collections;

public class MyArrayList<E> implements IArrayList<E>{
    private E[] data;
    private int currentSize;
    private final int size;
    private final int DEFAULT_SIZE = 10;

    public MyArrayList(int size) {
        this.size = size;
        this.data = (E[])new Object[size];
    }

    public MyArrayList() {
        this.size = DEFAULT_SIZE;
        this.data = (E[])new Object[DEFAULT_SIZE];
    }


    @Override
    public void add(E value) {
        add(value, currentSize);
    }

    @Override
    public void add(E value, int index) {
        data[index] = value;
        currentSize++;
        checkArrayLength(currentSize);
    }

    /*
    Добавочный метод к коду из лекции для проверки длины массива
     */
    private void checkArrayLength(int index) {
        if(index > data.length-1){
            E[] dataNew = (E[])new Object[(int) ((data.length*1.5) + 1)];
            System.arraycopy(data, 0, dataNew, 0, data.length);
            this.data = dataNew;
        }
    }

    @Override
    public void remove(int index) {
        data[index] = null;
        currentSize--;
    }

    @Override
    public E get(int index) {
        return data[index];
    }

    @Override
    public boolean find(E value) {
        for (int i = 0; i < currentSize; i++){
            if(value.equals(data[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public void display() {
        for (int i = 0; i < currentSize; i++){
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }

    @Override
    public int getCurrentSize() {
        return currentSize;
    }

    @Override
    public void sort() {
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data.length - 1; j++){
                Comparable a = (Comparable) data[i];
                Comparable b = (Comparable) data[j];
                if(a.compareTo(b) > 0){
                    exchange(i, j);
                }
            }
        }
    }
    /*
    Метод exchange(), который меняет два элемента массива местами (массив может быть любого
    ссылочного типа);
     */
    private void exchange(int i, int j) {
        E temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
