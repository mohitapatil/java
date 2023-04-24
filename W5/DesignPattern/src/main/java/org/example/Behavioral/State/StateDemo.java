package org.example.Behavioral.State;

public class StateDemo {
    public static void main(String[] args) {
        ContextState ctx = new ContextState(null, "p1");
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
}
