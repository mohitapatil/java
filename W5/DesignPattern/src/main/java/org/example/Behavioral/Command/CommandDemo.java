package org.example.Behavioral.Command;

public class CommandDemo {

    public static void main(String[] args) {
        Light livingRoomLight= new Light();
        Fan bedRoomFan = new Fan();

        HomeAutomationRemote remote = new HomeAutomationRemote();

        remote.setCommand(new FanCommand(bedRoomFan));
        remote.buttonPressed();
        remote.buttonPressed();
        remote.buttonPressed();

        remote.setCommand(new LightCommand(livingRoomLight));
        remote.buttonPressed();
        remote.buttonPressed();
    }
}
