package collections.Vegetables;

import java.util.Objects;

public class RootVegetable extends Vegetable {
    private boolean peelAvailability;

    public RootVegetable(String vegetableName, int vegetableCalories, String vegetableColor, String vegetableTaste, boolean peelAvailability) {
        super(vegetableName, vegetableCalories, vegetableColor, vegetableTaste);
        this.peelAvailability = peelAvailability;
    }

    public boolean isPeelAvailability() {
        return peelAvailability;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", Peel Availability =" + peelAvailability +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RootVegetable that = (RootVegetable) o;
        return peelAvailability == that.peelAvailability;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), peelAvailability);
    }
}
