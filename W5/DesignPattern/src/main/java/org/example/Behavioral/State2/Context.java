package org.example.Behavioral.State2;

import org.example.Behavioral.State.Acknowledged;

public class Context {
    private State2 state2;

    public void setState2(State2 state2) {
        this.state2 = state2;
    }

    public Context(State2 state2){
        this.state2= state2;
        if(this.state2==null){
            this.state2 = new Acknowledged2();
        }
    }

    public void update(){
        state2.nextstate(this);
    }
}
