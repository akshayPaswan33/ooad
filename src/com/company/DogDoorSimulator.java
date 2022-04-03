package com.company;

import com.company.dogdoor.Bark;
import com.company.dogdoor.BarkRecognizer;
import com.company.dogdoor.DogDoor;
import com.company.dogdoor.Remote;

import java.util.Arrays;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor();
        Remote remote = new Remote(dogDoor);

        remote.pressButton();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dogDoor.setAllowedBarks(Arrays.asList(new Bark("Yip"), new Bark("Woof")));
        BarkRecognizer barkRecognizer = new BarkRecognizer(dogDoor);
        barkRecognizer.recognize(new Bark("Yip"));

    }
}
