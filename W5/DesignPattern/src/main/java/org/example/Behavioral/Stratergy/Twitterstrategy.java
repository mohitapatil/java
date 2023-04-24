package org.example.Behavioral.Stratergy;

public class Twitterstrategy implements SocialMediaStrategy{

    @Override
    public void connectTo(String friendName) {
        System.out.println("Connecting with " + friendName + " through Twitter");
    }
}
