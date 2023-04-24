package org.example.Behavioral.Stratergy;

public class SocialMedia {
    SocialMediaStrategy smStrategy;

    public void setSocialmediaStrategy(SocialMediaStrategy smStrategy)
    {
        this.smStrategy = smStrategy;
    }

    public void connect(String name)
    {
        smStrategy.connectTo(name);
    }
}
