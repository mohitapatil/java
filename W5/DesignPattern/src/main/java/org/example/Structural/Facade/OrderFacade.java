package org.example.Structural.Facade;

public class OrderFacade {
    private WaiterSubsystem waiterSubsystem;
    private KitchenSubsystem kitchenSubsystem;

    public OrderFacade(WaiterSubsystem waiterSubsystem, KitchenSubsystem kitchenSubsystem){
        this.waiterSubsystem = waiterSubsystem;
        this.kitchenSubsystem = kitchenSubsystem;
    }

    public void orderFood(){
        waiterSubsystem.writeOrder();
        waiterSubsystem.sendToKitchen();
        kitchenSubsystem.preparefood();
        kitchenSubsystem.callWaiter();
        waiterSubsystem.serveCustomer();
        kitchenSubsystem.washDishes();
    }
}
