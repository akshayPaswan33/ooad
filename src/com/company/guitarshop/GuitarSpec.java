package com.company.guitarshop;

public class GuitarSpec extends InstrumentSpec{
    private final int numOfStrings;

    public GuitarSpec(String model, Builder builder, Type type, Wood backWood, Wood frontWood, int numOfStrings) {
        super(model, builder, type, backWood, frontWood);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        GuitarSpec that = (GuitarSpec) o;

        return numOfStrings == that.numOfStrings;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numOfStrings;
        return result;
    }
}
