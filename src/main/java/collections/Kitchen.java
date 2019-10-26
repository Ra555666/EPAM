package collections;

import collections.Vegetables.Vegetables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kitchen {
    private List<? extends Vegetables> salad;

    public Kitchen(List<? extends Vegetables> salad) {
        this.salad = salad;
    }

    public List<Vegetables> getVegetables() {
        List<Vegetables> vegetablesList = new ArrayList<>();
        for (Vegetables vegetables : salad) {
            if (vegetables instanceof Vegetables) {
                vegetablesList.add((Vegetables) vegetables);
            }
        }
        return vegetablesList;
    }

    public Vegetables getVegetablesWithMaxCalories() {
        List<Vegetables> vegetables = getVegetables();
        Vegetables vegetableWithMaxCalories = vegetables.get(0);
        for (Vegetables veg : vegetables) {
            if (veg.getVegetablesCalories() > vegetableWithMaxCalories.getVegetablesCalories()) {
                vegetableWithMaxCalories = veg;
            }
        }
        return vegetableWithMaxCalories;
    }

    public List<Vegetables> getVegetablesWithCaloriesInTheRange(int minCalories, int maxCalories) {
        List<Vegetables> caloriesInRange = new ArrayList<>();
        for (Vegetables vegetables : salad){
            if (vegetables.getVegetablesCalories() >= minCalories && vegetables.getVegetablesCalories() <= maxCalories){
                caloriesInRange.add((Vegetables) vegetables);
            }
        }
        return  caloriesInRange;
    }

    public int getSaladCalories(List<Vegetables> salad){
        int allCalories = 0;
        for (Vegetables veg: salad){
            allCalories +=veg.getVegetablesCalories();
        }
        return allCalories;
    }

    public Kitchen sortByCalories() {
        Collections.sort(salad, new Comparator<Vegetables>() {
            public int compare(Vegetables o1, Vegetables o2) {
                return o1.getVegetablesCalories() - o2.getVegetablesCalories();
            }
        });
        return this;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "Vegetables=" + salad.toString() +
                '}';
    }



}
