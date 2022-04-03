package com.company.dogdoor;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private List<Bark> allowedBarks;

    public DogDoor() {
        open = false;
    }

    public void open() {
        System.out.println("The dog door is open.");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        open = false;
        System.out.println("The dog door is closed.");
    }

    public boolean isOpen() {
        return open;
    }

    public List<Bark> getAllowedBarks() {
        return allowedBarks;
    }

    public void setAllowedBarks(List<Bark> allowedBarks) {
        this.allowedBarks = allowedBarks;
    }
}
