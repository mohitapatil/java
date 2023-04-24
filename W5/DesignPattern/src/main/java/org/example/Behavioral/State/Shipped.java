package org.example.Behavioral.State;

public class Shipped implements PackageState{
    private static Shipped instance = new Shipped();

    private Shipped() {}

    public static Shipped instance() {
        return instance;
    }

    @Override
    public void updateState(ContextState ctx)
    {
        System.out.println("Package is shipped !!");
        ctx.setCurrentState(OutForDelivery.instance());
    }
}
