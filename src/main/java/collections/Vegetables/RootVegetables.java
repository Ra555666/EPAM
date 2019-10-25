package collections.Vegetables;

import java.util.Objects;

public class RootVegetables extends Vegetables {
    private boolean peelAvailability;

    public RootVegetables(String vegetablesName, int vegetablesCalories, String vegetablesColor, String vegetablesTaste, boolean peelAvailability) {
        super(vegetablesName, vegetablesCalories, vegetablesColor, vegetablesTaste);
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
        RootVegetables that = (RootVegetables) o;
        return peelAvailability == that.peelAvailability;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), peelAvailability);
    }
}
