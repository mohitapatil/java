package org.example.Structural.Adapter;

import java.util.concurrent.Callable;

public class AdapterDemo {

    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
