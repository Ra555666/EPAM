package collections;


import collections.Vegetables.FruitVegetables;
import collections.Vegetables.RootVegetables;
import collections.Vegetables.Vegetables;
import java.util.Arrays;
import java.util.List;

public class Bowl {
    static List<Vegetables> salad = Arrays.asList(new RootVegetables("Cabbage", 50,"White","Sweet",false),
                                                        new RootVegetables("Onion", 20,"White","Oniony",true),
                                                        new RootVegetables("Parsley",2,"Green","Fresh",false),
                                                        new FruitVegetables("Tomato",10,"Red","Sweet",false),
                                                        new FruitVegetables("Red Pepper",15,"Yellow","Sweet",true),
                                                        new FruitVegetables("Cucumber",1,"Green","Neutral",true)
    );

    public Bowl(List<Vegetables> salad) {
    }

    public static void main(String[] args) {
        Kitchen testKitchen = new Kitchen(salad);
        System.out.println("Vegetables with max calories: " + testKitchen.getVegetablesWithMaxCalories().toString());
        System.out.println("Vegetables with range of calories: " + testKitchen.getVegetablesWithCaloriesInTheRange(10,20).toString());

    }

}
