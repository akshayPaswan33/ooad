package com.company.guitarshop;

public class MandolinSpec extends InstrumentSpec {
    private final Style style;

    public MandolinSpec(String model, Builder builder, Type type, Wood backWood, Wood frontWood, Style style) {
        super(model, builder, type, backWood, frontWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MandolinSpec that = (MandolinSpec) o;

        return style == that.style;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + style.hashCode();
        return result;
    }
}
