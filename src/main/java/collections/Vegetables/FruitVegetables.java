package collections.Vegetables;

import java.util.Objects;

public class FruitVegetables extends Vegetables {
    private boolean  seedAvailability;

    public FruitVegetables(String vegetablesName, int vegetablesCalories, String vegetablesColor, String vegetablesTaste, boolean seedAvailability) {
        super(vegetablesName, vegetablesCalories, vegetablesColor, vegetablesTaste);
        this.seedAvailability = seedAvailability;
    }

    public boolean isSeedAvailability() {
        return seedAvailability;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", Seed Availability =" + seedAvailability +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FruitVegetables that = (FruitVegetables) o;
        return seedAvailability == that.seedAvailability;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seedAvailability);
    }
}
