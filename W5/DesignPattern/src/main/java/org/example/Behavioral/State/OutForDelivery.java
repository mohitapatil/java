package org.example.Behavioral.State;

public class OutForDelivery implements PackageState{
    private static OutForDelivery instance = new OutForDelivery();

    private OutForDelivery() {}

    public static OutForDelivery instance() {
        return instance;
    }

    @Override
    public void updateState(ContextState ctx)
    {
        System.out.println("Package is out of delivery !!");
        ctx.setCurrentState(Delivered.instance());
    }
}
