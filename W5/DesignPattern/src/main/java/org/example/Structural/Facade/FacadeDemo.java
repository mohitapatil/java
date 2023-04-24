package org.example.Structural.Facade;

public class FacadeDemo {

    public static void main(String[] args) {
        OrderFacade orderFacade= new OrderFacade(
                new WaiterSubsystem(),
                new KitchenSubsystem());
        orderFacade.orderFood();
    }
}
