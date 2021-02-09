package homework1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayListTest();
        BoxTest();
    }



    private static void ArrayListTest() {
        MyArrayList<Integer> myArrayList = new MyArrayList<>(2);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.display();
    }

    private static void BoxTest() {
        Apple[] apples = {new Apple(), new Apple(), new Apple()};
        Orange[] oranges = {new Orange(), new Orange()};
        Box<Apple> boxApples = new Box<>(apples);
        Box<Orange> boxOranges = new Box<>(oranges);
        boxApples.add(new Apple());
        boxOranges.add(new Orange());
        System.out.println("Вес коробки с яблоками " + boxApples.getWeight());
        System.out.println("Вес коробки с апельсинами " + boxOranges.getWeight());
        System.out.println("Равны ли веса коробок " + boxApples.compare(boxOranges));
        System.out.println("Равны ли веса коробок " + boxApples.compare(boxApples));

        Box<Apple> boxApples2 = new Box<>();
        boxApples.emptyTo(boxApples2);
        System.out.println("Вес старой коробки после пересыпания фруктов " + boxApples.getWeight());
        System.out.println("Вес новой коробки после пересыпания фруктов " + boxApples2.getWeight());
    }
}
