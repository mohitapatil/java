package com.sapient.threads;

public class OwnerThread implements Runnable{
    @Override
    public void run(){
        System.out.println("Current thread ID "+Thread.currentThread().getId());
        System.out.println("Current thread Name "+Thread.currentThread().getName());
        System.out.println("Current thread Alive "+Thread.currentThread().isAlive());
        System.out.println("Current thread State "+Thread.currentThread().getState());
        System.out.println("Current thread Prioriy777777777777777777777777777777777777777777777777Sniy "+Thread.currentThread().getPriority());

    }
}
