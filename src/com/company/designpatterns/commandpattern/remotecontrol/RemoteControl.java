package com.company.designpatterns.commandpattern.remotecontrol;

public class RemoteControl {
    private final Command[] onCommands;
    private final Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i=0; i<7; ++i){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onExecute(int slot) {
        onCommands[slot].execute();
    }

    public void offExecute(int slot) {
        offCommands[slot].execute();
    }
}
