package org.example.Behavioral.Observer;

public class MySubscriber extends Subscriber{

    public MySubscriber(Content content, String name){
        this.content=content;
        this.name= name;
        this.content.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "My Subscriber: "+ this.name+ " has state "+ Integer.toBinaryString( content.getState() ) );
    }
}
