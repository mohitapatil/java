package org.example.Behavioral.Command;

public class LightCommand implements Command{
    Light light;

    public LightCommand(Light light){
        this.light= light;
    }

    @Override
    public void execute(boolean command){
        if(command){
            light.turnOn();
        }
        else light.turnOff();
    }
}
