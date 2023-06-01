package com.sapient.threads;

import com.sapient.models.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageSimulator implements Runnable{
    private List<Message> messages;

    public MessageSimulator() {
        this.messages=new ArrayList<>();
    }


    public void producerMessage(){
        while(true) {
            if (messages.size() == 0) {
                System.out.println("Message Not found in List....");
                try {
                    for (int i = 0; i < 100; i++) {
                        messages.add(new Message(i, "Message" + i));
                    }

                    Thread.sleep(2000);
                    notify();

                } catch (InterruptedException e) {

                }


            } else {
                try {
                    wait();
                } catch (InterruptedException e) {

                }
            }
        }

    }

    public synchronized void consumerMessage(){

        while(true) {
            if (this.messages.size() > 0) {
                System.out.println("Entering consumer......");
                try {
                    for (Message message : messages)
                        System.out.println(message);

                    Thread.sleep(2000);
                    messages.clear();
                    notify();
                } catch (InterruptedException e) {

                }

            } else {
                try {
                    System.out.println("Waiting for the message");
                    wait();
                } catch (InterruptedException e) {

                }
            }
        }

    }

    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("Producer"))
            producerMessage();
        else
            consumerMessage();
    }


}
