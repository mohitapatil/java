package org.example.Behavioral.Stratergy;

public class FacebookSterategy implements SocialMediaStrategy{
    @Override
    public void connectTo(String friendName) {
        System.out.println("Connecting with " + friendName + " through Facebook");
    }
}
