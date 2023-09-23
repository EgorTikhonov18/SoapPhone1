public class Main {
    public static void main(String[] args) {
        Banana ban1 = new Banana();
        Banana ban2 = new Banana();
        Banana ban3 = new Banana();
        FruitBox<Banana> bananaFruitBox = new FruitBox<>();
        bananaFruitBox.addFruit(ban1);
        bananaFruitBox.addFruit(ban2);
        bananaFruitBox.addFruit(ban3);
        //System.out.println(bananaFruitBox);
        //System.out.println(bananaFruitBox.size());
        System.out.println(bananaFruitBox.get(0));
        System.out.println(bananaFruitBox.get(1));

        WaterMelon wm1 = new WaterMelon();
        WaterMelon wm2 = new WaterMelon();
        WaterMelon wm3 = new WaterMelon();
        //bananaFruitBox.addFruit(wm1); // супер, не принимает другой тип того же наследника
        FruitBox<WaterMelon> waterMelonFruitBox = new FruitBox<>();
        waterMelonFruitBox.addFruit(wm1);
        waterMelonFruitBox.addFruit(wm2);
        //waterMelonFruitBox.addFruit(wm3);
        //waterMelonFruitBox.addFruit(ban1); // тоже не принимает
        //System.out.println(waterMelonFruitBox);

        FruitBox<WaterMelon> newWMBox = new FruitBox<>();
        FruitBox<Banana> newBananaBox = new FruitBox<>();

        System.out.println(waterMelonFruitBox.size() + " количество арбузов в корзине");
       // System.out.println(bananaFruitBox.size() + " количество бананов в корзине");
        waterMelonFruitBox.replaceFruits(newWMBox);
        System.out.println(newWMBox.size() + " Колмчесвто арбузов в новой корзине");
        System.out.println(waterMelonFruitBox.size() + " количество арбузов в изначальной корзине");

        System.out.println(bananaFruitBox.getWeight() + " вес коробки с бананами");
        System.out.println(waterMelonFruitBox.getWeight() + " вес коробки с арбузами");
        System.out.println(bananaFruitBox.compareTo(waterMelonFruitBox));
       // System.out.println(waterMelonFruitBox.getFruitBox());

    }
}
