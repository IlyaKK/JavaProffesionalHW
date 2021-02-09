package homework1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <E extends Fruit>{
    private ArrayList<E> fruits;

    public Box(E[] fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void add(E fruit){
        this.fruits.add(fruit);
    }

    public float getWeight(){
        float weight = 0;
        if(fruits.size()!=0) {
            weight = fruits.get(0).getWeight() * fruits.size();
        }
        return weight;
    }

    public boolean compare(Box<?> anotherBox) {
        if(this.getWeight() == anotherBox.getWeight()){
            return true;
        }else {
            return false;
        }
    }

    public void emptyTo(Box<E> c){
        for (E fruit : this.fruits) {
            c.add(fruit);
        }
        this.fruits.clear();
    }
}
