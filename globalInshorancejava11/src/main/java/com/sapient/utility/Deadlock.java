package com.sapient.utility;

import com.sapient.models.Vehicle;
import com.sapient.threads.VehicleDeadlockSimulation;

public class Deadlock {

    public static void main(String[] args){

        Vehicle[] vehicles=new Vehicle[2];
        vehicles[0]=new Vehicle();
        vehicles[1]=new Vehicle();
        VehicleDeadlockSimulation[] vehicleDeadlockSimulations=
                new VehicleDeadlockSimulation[2];


        vehicleDeadlockSimulations[0]=new
                VehicleDeadlockSimulation(vehicles[0],vehicles[1],"Thread"+0);

        vehicleDeadlockSimulations[1]=new
                VehicleDeadlockSimulation(vehicles[1],vehicles[0],"Thread"+1);
    }
}
