import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banana ban1 = new Banana();
        Banana ban2 = new Banana();
        Banana ban3 = new Banana();
        FruitBox<Banana> bananaFruitBox = new FruitBox<>();
        bananaFruitBox.addFruits(ban1);
        bananaFruitBox.addFruits(ban2);
        bananaFruitBox.addFruits(ban3);
        //System.out.println(bananaFruitBox);
        //System.out.println(bananaFruitBox.size());
        System.out.println(bananaFruitBox.get(0));
        System.out.println(bananaFruitBox.get(1));

        WaterMelon wm1 = new WaterMelon();
        WaterMelon wm2 = new WaterMelon();
        WaterMelon wm3 = new WaterMelon();
        //bananaFruitBox.addFruit(wm1); // супер, не принимает другой тип того же наследника
        FruitBox<WaterMelon> waterMelonFruitBox = new FruitBox<>();
        waterMelonFruitBox.addFruits(wm1);
        waterMelonFruitBox.addFruits(wm2);

        FruitBox<WaterMelon> newWMBox = new FruitBox<>();
        FruitBox<Banana> newBananaBox = new FruitBox<>();

        System.out.println(waterMelonFruitBox.getWeight() + " количество арбузов в корзине");
       // System.out.println(bananaFruitBox.size() + " количество бананов в корзине");
        waterMelonFruitBox.replaceFruits(newWMBox);
        System.out.println("результат после перемещения");
       // newWMBox.replaceFruits(waterMelonFruitBox);

        System.out.println(waterMelonFruitBox.getWeight() + " количество арбузов в изначальной корзине");
        System.out.println(newWMBox.getWeight() + " Колмчесвто арбузов в новой корзине");

       System.out.println(bananaFruitBox.getWeight() + " вес коробки с бананами");
       System.out.println(waterMelonFruitBox.getWeight() + " вес коробки с арбузами");
       System.out.println(bananaFruitBox.compareTo(waterMelonFruitBox));
        System.out.println(newWMBox.compareTo(waterMelonFruitBox));
        System.out.println(waterMelonFruitBox.compareTo(newWMBox));
       // System.out.println(waterMelonFruitBox.getFruitBox());

    }
}
