package org.example.Behavioral.Observer;

public abstract class Subscriber {
    protected Content content;
    protected String name;
    public abstract void update();
}
