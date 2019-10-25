package collections.Vegetables;

import java.util.Objects;

abstract public class Vegetables {
    private String vegetablesName;
    private int vegetablesCalories;
    private String vegetablesColor;
    private String vegetablesTaste;

    public Vegetables(String vegetablesName, int vegetablesCalories, String vegetablesColor, String vegetablesTaste) {
        this.vegetablesName = vegetablesName;
        this.vegetablesCalories = vegetablesCalories;
        this.vegetablesColor = vegetablesColor;
        this.vegetablesTaste = vegetablesTaste;
    }

    public String getVegetablesName() {
        return vegetablesName;
    }

    public int getVegetablesCalories() {
        return vegetablesCalories;
    }

    public String getVegetablesColor() {
        return vegetablesColor;
    }

    public String getVegetablesTaste() {
        return vegetablesTaste;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "vegetablesName='" + vegetablesName + '\'' +
                ", vegetablesCalories=" + vegetablesCalories +
                ", vegetablesColor='" + vegetablesColor + '\'' +
                ", vegetablesTaste='" + vegetablesTaste + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetables that = (Vegetables) o;
        return vegetablesCalories == that.vegetablesCalories &&
                vegetablesName.equals(that.vegetablesName) &&
                vegetablesColor.equals(that.vegetablesColor) &&
                vegetablesTaste.equals(that.vegetablesTaste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vegetablesName, vegetablesCalories, vegetablesColor, vegetablesTaste);
    }
}
