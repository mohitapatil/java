package org.example.Behavioral.Command;

public class FanCommand implements Command{

    Fan fan;

     public FanCommand(Fan fan){
         this.fan= fan;
     }

    @Override
    public void execute(boolean command){
         if(command){
             fan.start();
         }
         else fan.stop();
    }
}
