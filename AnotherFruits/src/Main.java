import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
       /* Apple a1 = new Apple();
        Apple a2 = new Apple();
        appleBox.addFruits(a1, a2);*/

        //Box<Orange> orangeBox = new Box<>();

        for (int i = 0; i < 72; i++) {
            appleBox.addFruits(new Apple());
        }

        for (int i = 0; i < 12; i++) {
            appleBox2.addFruits(new Apple());
        }

        /*for (int i = 0; i < 48; i++) {
            orangeBox.addFruits(new Orange());
        }*/


        System.out.println("Box 1 wight before = " + appleBox.getWeight());
        System.out.println("Box 2 wight before = " + appleBox2.getWeight());

        //System.out.println(appleBox.compare(orangeBox));
        appleBox.transferToAnother(appleBox2);

        System.out.println("Box 1 wight after = " + appleBox.getWeight());
        System.out.println("Box 2 wight after = " + appleBox2.getWeight());

        System.out.println(appleBox.compare(appleBox2)); // второй был - orangeBox

     /*   Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> ints = arrToColl(arr);

        System.out.println(ints.toString());*/

    }

  /*  *//* 1 *//*
    private static <T> void swapper(List<T> list, int a, int b) {
        try {
            T arraySwapUnit = list.get(a);
            list.set(a, list.get(b));
            list.set(b, arraySwapUnit);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Укажите значения a и b в пределах массива");
        }
    }

    *//* 2 *//*
    private static <T> List<T> arrToColl(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
*/
}

abstract class Fruit {

    private float weight;

    Fruit(float weight) {
        this.weight = weight;
    }

    float getWeight() {
        return weight;
    }
}

class Apple extends Fruit {

    Apple() {
        super(1f);
    }
}

/*class Orange extends Fruit {

    Orange() {
        super(1.5f);
    }
}*/


class Box<T extends Fruit> {

    private List<T> fruits = new ArrayList<>();

    @SafeVarargs
    final void addFruits(T... fruit) {
        fruits.addAll(Arrays.asList(fruit));
    }

    private void addFruits(List<T> fruits) {
        this.fruits.addAll(fruits);
    }

    float getWeight() {
        if (fruits.size() == 0) {
            return 0;
        } else {
            return fruits.get(0).getWeight() * fruits.size();
        }
    }

    boolean compare(Box<?> another) {
        return this.getWeight() == another.getWeight();
    }

    void transferToAnother(Box<T> another) {
        another.addFruits(this.fruits);
        this.fruits.clear();
    }
}

