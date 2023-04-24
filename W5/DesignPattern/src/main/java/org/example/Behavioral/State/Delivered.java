package org.example.Behavioral.State;

public class Delivered implements PackageState{
    private static Delivered instance = new Delivered();

    private Delivered() {}

    public static Delivered instance() {
        return instance;
    }

    @Override
    public void updateState(ContextState ctx)
    {
        System.out.println("Package is delivered!!");
    }
}
