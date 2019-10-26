package collections;

import collections.Vegetables.Vegetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kitchen {
    private List<? extends Vegetable> salad;

    public Kitchen(List<? extends Vegetable> salad) {
        this.salad = salad;
    }

    public List<Vegetable> getVegetable() {
        List<Vegetable> vegetablesList = new ArrayList<>();
        for (Vegetable vegetable : salad) {
            if (vegetable instanceof Vegetable) {
                vegetablesList.add((Vegetable) vegetable);
            }
        }
        return vegetablesList;
    }

    public Vegetable getVegetableWithMaxCalories() {
        List<Vegetable> vegetables = getVegetable();
        Vegetable vegetableWithMaxCalories = vegetables.get(0);
        for (Vegetable veg : vegetables) {
            if (veg.getVegetableCalories() > vegetableWithMaxCalories.getVegetableCalories()) {
                vegetableWithMaxCalories = veg;
            }
        }
        return vegetableWithMaxCalories;
    }

    public List<Vegetable> getVegetableWithCaloriesInTheRange(int minCalories, int maxCalories) {
        List<Vegetable> caloriesInRange = new ArrayList<>();
        for (Vegetable vegetable : salad) {
            if (vegetable.getVegetableCalories() >= minCalories & vegetable.getVegetableCalories() <= maxCalories) {
                caloriesInRange.add((Vegetable) vegetable);
            }
        }
        return caloriesInRange;
    }

    public int getSaladCalories(List<Vegetable> salad) {
        int allCalories = 0;
        for (Vegetable veg : salad) {
            allCalories += veg.getVegetableCalories();
        }
        return allCalories;
    }

    public Kitchen sortByCalories() {
        Collections.sort(salad, new Comparator<Vegetable>() {
            public int compare(Vegetable o1, Vegetable o2) {
                return o1.getVegetableCalories() - o2.getVegetableCalories();
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
