package org.example.Behavioral.State;

public class Acknowledged implements PackageState{
    private static Acknowledged instance = new Acknowledged();
    private Acknowledged() {}
    public static Acknowledged instance() {
        return instance;
    }

    @Override
    public void updateState(ContextState ctx)
    {
        System.out.println("Package is acknowledged !!");
        ctx.setCurrentState(Shipped.instance());
    }
}
