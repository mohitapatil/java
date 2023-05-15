package org.example.Behavioral.State2;

public class Delivered2 implements State2{
    @Override
    public void nextstate(Context ctx) {
        System.out.println("Delivered");
    }
}
