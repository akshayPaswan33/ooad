package com.company.dogdoor;

public class BarkRecognizer {
    private final DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void recognize(Bark bark) {
        System.out.println("Recognizer hears a bark.");
        for(Bark allowedBark : dogDoor.getAllowedBarks()) {
            if(allowedBark.equals(bark)) {
                dogDoor.open();
                break;
            }
        }
    }
}
