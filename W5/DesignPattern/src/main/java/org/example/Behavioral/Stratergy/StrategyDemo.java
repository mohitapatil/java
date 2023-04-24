package org.example.Behavioral.Stratergy;

public class StrategyDemo {

    public static void main(String[] args) {
        SocialMedia MyStrategy= new SocialMedia();

        MyStrategy.setSocialmediaStrategy(new FacebookSterategy());
        MyStrategy.connect("Name1");

        MyStrategy.setSocialmediaStrategy(new Twitterstrategy());
        MyStrategy.connect("Name2");
    }
}
