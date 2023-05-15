package org.example.Behavioral.State2;

import org.example.Behavioral.State.ContextState;

public class State2Demo {
    public static void main(String[] args) {
        Context ctx = new Context(null);
        ctx.update();
        ctx.update();
        ctx.update();
    }
}
