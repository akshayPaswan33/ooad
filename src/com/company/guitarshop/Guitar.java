package com.company.guitarshop;

public class Guitar {
    private String serialNumber, model;
    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood frontWood;
    private double price;

    public Guitar(String serialNumber, String model, Builder builder, Type type, Wood backWood, Wood frontWood, double price) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.frontWood = frontWood;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
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

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "serialNumber='" + serialNumber + '\'' +
                ", model='" + model + '\'' +
                ", builder=" + builder +
                ", type=" + type +
                ", backWood=" + backWood +
                ", frontWood=" + frontWood +
                ", price=" + price +
                '}';
    }
}
