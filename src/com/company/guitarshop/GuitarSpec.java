package com.company.guitarshop;

public class GuitarSpec {
    private String model;
    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood frontWood;
    private int numOfStrings;

    public GuitarSpec(String model, Builder builder, Type type, Wood backWood, Wood frontWood, int numOfStrings) {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.frontWood = frontWood;
        this.numOfStrings = numOfStrings;
    }

    public String getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getFrontWood() {
        return frontWood;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    @Override
    public String toString() {
        return "GuitarSpec{" +
                "model='" + model + '\'' +
                ", builder=" + builder +
                ", type=" + type +
                ", backWood=" + backWood +
                ", frontWood=" + frontWood +
                ", numOfStrings=" + numOfStrings +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GuitarSpec that = (GuitarSpec) o;

        if (numOfStrings != that.numOfStrings) return false;
        if (!model.equals(that.model)) return false;
        if (builder != that.builder) return false;
        if (type != that.type) return false;
        if (backWood != that.backWood) return false;
        return frontWood == that.frontWood;
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + builder.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + backWood.hashCode();
        result = 31 * result + frontWood.hashCode();
        result = 31 * result + numOfStrings;
        return result;
    }
}
