package com.company.dogdoor;

import java.util.Objects;

public class Bark {
    private final String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bark bark = (Bark) o;

        return Objects.equals(sound, bark.sound);
    }

    @Override
    public int hashCode() {
        return sound != null ? sound.hashCode() : 0;
    }
}
