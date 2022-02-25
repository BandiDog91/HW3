package fruits;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private final String nameBox;
    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits, String nameBox) {
        this.fruits = fruits;
        this.nameBox = nameBox;
    }

    public float getWeight() {
        float result = 0;
        for (T fruit : fruits) {
            result += fruit.weight;
        }
        return result;
    }

    public void compare(Box<?> another, String nameBox) {
        float currentWeight = getWeight();
        float anotherWeight = another.getWeight();

        if (currentWeight > anotherWeight) {
            System.out.println("Коробка " + getNameBox() + " тяжелее коробки " + nameBox);
        } else if (currentWeight < anotherWeight) {
            System.out.println("Коробка " + getNameBox() + " легче коробки " + nameBox);
        } else {
            System.out.println("Коробки одинаковые по весу.");
        }
    }

    public void transferTo(Box<T> other) {
        other.fruits.addAll(fruits);
        fruits.clear();
    }

    public String getNameBox() {
        return nameBox;
    }
}
