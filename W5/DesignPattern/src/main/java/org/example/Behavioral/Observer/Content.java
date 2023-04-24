package org.example.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Content {
    private List<Subscriber> subscribersList = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Subscriber subscriber){
        subscribersList.add(subscriber);
    }

    public void notifyAllObservers(){
        for (Subscriber subscriber : subscribersList) {
            subscriber.update();
        }
    }
}
