package com.company.designpatterns.commandpattern.remotecontrol;

public class Test {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        remoteControl.setCommand(new LightOnCommand(new Light()));
        remoteControl.buttonWasPressed();

        RemoteControl remoteControl1 = new RemoteControl();
        remoteControl1.setCommand(1, new LightOnCommand(new Light()), new NoCommand());
        remoteControl1.onExecute(1);
    }
}
