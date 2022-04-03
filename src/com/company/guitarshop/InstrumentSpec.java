package com.company.guitarshop;

import java.util.Map;

public class InstrumentSpec {
    private final Map<String, Object> properties;

    public InstrumentSpec(Map<String, Object> properties) {
        this.properties = properties;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InstrumentSpec that = (InstrumentSpec) o;

        return properties.equals(that.properties);
    }

    @Override
    public int hashCode() {
        return properties.hashCode();
    }
}
