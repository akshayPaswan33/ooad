package com.company.guitarshop;

public class GuitarSpec {
    private String model;
    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood frontWood;

    public GuitarSpec(String model, Builder builder, Type type, Wood backWood, Wood frontWood) {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.frontWood = frontWood;
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

    @Override
    public String toString() {
        return "GuitarSpec{" +
                "model='" + model + '\'' +
                ", builder=" + builder +
                ", type=" + type +
                ", backWood=" + backWood +
                ", frontWood=" + frontWood +
                '}';
    }
}
