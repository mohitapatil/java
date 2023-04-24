package org.example.Behavioral.Command;

public class HomeAutomationRemote {
    Command command;
    boolean button=false;

    //Set the command in runtime to trigger.
    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed() {
        button=!button;
        command.execute(button);
    }
}
