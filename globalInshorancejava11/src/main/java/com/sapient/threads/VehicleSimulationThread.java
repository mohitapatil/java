package com.sapient.threads;

import com.sapient.models.Vehicle;

public class VehicleSimulationThread implements Runnable{
    private Vehicle vehicle;
    private String regNo;
    public VehicleSimulationThread(Vehicle name, String threadName, String regNo){
        this.vehicle=vehicle;
        this.regNo=regNo;
        new Thread(this,threadName).start();
    }
    @Override
    public void run(){
        synchronized (this.vehicle){
            try{
                System.out.println("\n"+Thread.currentThread().getName()+"\t");
                vehicle.sendMessage(regNo);
            }catch(RuntimeException e){
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        rest of code not synchronized
    }
}
