import java.util.*;

public class FruitBox<T extends Fruit>  {

    public void setBox(ArrayList<T> box) {
        this.box = box;
    }

    private ArrayList<T> box;
    int size = 0;
    public FruitBox(T... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits)); // потестируй если, просто оставить с this
    }

    public List<T> getFruitBox(){
        return box;
    }
    public void addFruit(T fruit){ // можно ли тут без параметров
        box.add(fruit);
        size++;
    }
    public T get(int index){
        return box.get(index);
    }
    public double getWeight(){
      double totalWeight=0;
       for (int i = 0; i < box.size(); i++) {
            totalWeight += box.get(i).getWeight();
        }
       return totalWeight;
    }
    public void replaceFruits(FruitBox<T> newBox) {


    }
//
    public int compareTo(FruitBox<? extends Fruit> box2){
        if (getWeight() > box2.getWeight() ){
            System.out.println("Первый box больше второго");
            return -1;
        } else if (getWeight() < box2.getWeight() ){
            System.out.println("Второй box больше первого");
            return 1;
        } else{
            System.out.println("Равны");
            return 0;
        }
    }
    public int size(){
        return size;
    }
}
