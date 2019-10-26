package collections.Vegetables;

import java.util.Objects;

public class FruitVegetable extends Vegetable {
    private boolean seedAvailability;

    public FruitVegetable(String vegetableName, int vegetableCalories, String vegetableColor, String vegetableTaste, boolean seedAvailability) {
        super(vegetableName, vegetableCalories, vegetableColor, vegetableTaste);
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
        FruitVegetable that = (FruitVegetable) o;
        return seedAvailability == that.seedAvailability;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seedAvailability);
    }
}
