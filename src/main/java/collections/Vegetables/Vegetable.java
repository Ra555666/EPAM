package collections.Vegetables;

import java.util.Objects;

abstract public class Vegetable {
    private String vegetableName;
    private int vegetableCalories;
    private String vegetableColor;
    private String vegetableTaste;

    public Vegetable(String vegetableName, int vegetableCalories, String vegetableColor, String vegetableTaste) {
        this.vegetableName = vegetableName;
        this.vegetableCalories = vegetableCalories;
        this.vegetableColor = vegetableColor;
        this.vegetableTaste = vegetableTaste;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public int getVegetableCalories() {
        return vegetableCalories;
    }

    public String getVegetableColor() {
        return vegetableColor;
    }

    public String getVegetableTaste() {
        return vegetableTaste;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "vegetableName='" + vegetableName + '\'' +
                ", vegetableCalories=" + vegetableCalories +
                ", vegetableColor='" + vegetableColor + '\'' +
                ", vegetableTaste='" + vegetableTaste + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable that = (Vegetable) o;
        return vegetableCalories == that.vegetableCalories &&
                vegetableName.equals(that.vegetableName) &&
                vegetableColor.equals(that.vegetableColor) &&
                vegetableTaste.equals(that.vegetableTaste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vegetableName, vegetableCalories, vegetableColor, vegetableTaste);
    }
}
