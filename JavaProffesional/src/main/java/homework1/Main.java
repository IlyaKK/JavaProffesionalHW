package homework1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayListTest();
    }

    private static void ArrayListTest() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>(2);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.display();
    }
}
