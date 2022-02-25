import fruits.Apple;
import fruits.Banana;
import fruits.Box;
import fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"6", "9", "11"};
        System.out.println("Было " + (Arrays.toString(arr)));
        changeArrayElements(arr, 0, 1, 2);
        System.out.println("Стало " + Arrays.toString(arr));

        Box<Apple> appleBox = new Box<>(makeNewApples(5), "Яблоки");
        Box<Orange> orangeBox = new Box<>(makeNewOranges(10), "Апельсины");
        Box<Orange> secondOrangeBox = new Box<>(makeNewOranges(0), "Апельсины");
        Box<Banana> bananaBox = new Box<>(makeNewBanana(15), "Бананы");

        appleBox.compare(orangeBox, "Апельсины");
        appleBox.compare(secondOrangeBox, "Апельсины");
        orangeBox.transferTo(secondOrangeBox);
        appleBox.compare(orangeBox, "Апельсины");
        appleBox.compare(secondOrangeBox, "Апельсины");
        bananaBox.compare(appleBox, "Яблоки");
    }

    public static <T> void changeArrayElements(T[] array, int firstArr, int secondArr, int thirdArr) {
        try {
            T arrayElement = array[firstArr];
            array[firstArr] = array[thirdArr];
            array[secondArr] = array[secondArr];
            array[thirdArr] = arrayElement;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Не корректные индексы");
            e.printStackTrace();
        }
    }

    public static ArrayList<Apple> makeNewApples(int count) {
        ArrayList<Apple> fruits = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            fruits.add(new Apple());
        }
        return fruits;
    }

    public static ArrayList<Orange> makeNewOranges(int count) {
        ArrayList<Orange> fruits = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            fruits.add(new Orange());
        }
        return fruits;
    }

    public static ArrayList<Banana> makeNewBanana(int count) {
        ArrayList<Banana> fruits = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            fruits.add(new Banana());
        }
        return fruits;
    }
}

