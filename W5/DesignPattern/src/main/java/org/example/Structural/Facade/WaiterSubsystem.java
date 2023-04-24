package org.example.Structural.Facade;

public class WaiterSubsystem {
    public void writeOrder(){
        System.out.println("Waiter writes your order");
    }
    public  void sendToKitchen(){
        System.out.println("Send order to kitchen");
    }

    public void serveCustomer(){
        System.out.println("!!!! We get the food");
    }
}
