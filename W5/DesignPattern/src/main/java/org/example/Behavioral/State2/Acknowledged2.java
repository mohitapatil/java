package org.example.Behavioral.State2;

public class Acknowledged2 implements State2 {

    @Override
    public void nextstate(Context ctx) {
        System.out.println("Acknowl done");
        ctx.setState2(new Shipped2());
    }
}
