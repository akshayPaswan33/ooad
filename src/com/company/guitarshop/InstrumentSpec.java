package com.company.guitarshop;

public abstract class InstrumentSpec {
    private final String model;
    private final Builder builder;
    private final Type type;
    private final Wood backWood;
    private final Wood frontWood;

    public InstrumentSpec(String model, Builder builder, Type type, Wood backWood, Wood frontWood) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InstrumentSpec that = (InstrumentSpec) o;

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
        return result;
    }
}
