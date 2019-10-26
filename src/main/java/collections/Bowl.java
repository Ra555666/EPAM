package collections;


import collections.Vegetables.FruitVegetable;
import collections.Vegetables.RootVegetable;
import collections.Vegetables.Vegetable;

import java.util.Arrays;
import java.util.List;

public class Bowl {
    static List<Vegetable> salad = Arrays.asList(new RootVegetable("Cabbage", 50, "White", "Sweet", false),
            new RootVegetable("Onion", 20, "White", "Oniony", true),
            new RootVegetable("Parsley", 2, "Green", "Fresh", false),
            new FruitVegetable("Tomato", 10, "Red", "Sweet", false),
            new FruitVegetable("Red Pepper", 15, "Yellow", "Sweet", true),
            new FruitVegetable("Cucumber", 1, "Green", "Neutral", true)
    );


    public static void main(String[] args) {
        Kitchen testKitchen = new Kitchen(salad);
        System.out.println("Vegetable with max calories: " + testKitchen.getVegetableWithMaxCalories().toString());
        System.out.println("Vegetable with range of calories: " + testKitchen.getVegetableWithCaloriesInTheRange(10, 20).toString());
        System.out.println("Caloric value of salad is: " + testKitchen.getSaladCalories(salad));
        System.out.println("Sort by calories: " + testKitchen.sortByCalories().toString());

    }

}
