package com.sapient.utility;

import com.sapient.models.Owner;
import com.sapient.models.Vehicle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String[] args){
        List<Owner> cabs=new ArrayList<>();
        Set<Vehicle> vehicles=new HashSet<>();
        Owner owner1=new Owner();
        owner1.setName("Atul");

        Vehicle vehicle= new Vehicle();
        vehicle.setModel("Hundaui");
        vehicle.setRegNo("j3434");

        vehicles.add(vehicle);

        vehicle= new Vehicle();
        vehicle.setModel("Hundaui2");
        vehicle.setRegNo("j343499");
        vehicles.add(vehicle);

        owner1.setVehicles(vehicles);

//        FOR OWNER 2
        vehicles=new HashSet<Vehicle>();
        Owner owner2=new Owner();
        owner1.setName("Atul2");

        vehicle= new Vehicle();
        vehicle.setModel("Hundaui3");
        vehicle.setRegNo("j3434");

        vehicles.add(vehicle);

        vehicle= new Vehicle();
        vehicle.setModel("Hundaui2");
        vehicle.setRegNo("j343499");
        vehicles.add(vehicle);

        owner2.setVehicles(vehicles);

        cabs.add(owner1);
        cabs.add(owner2);

        List<String> cars = cabs.stream().map(u->u.getVehicles()).flatMap(v->v.stream())
                .map(m->m.getModel()).distinct().collect(Collectors.toList());

        System.out.println(cars);
    }
}
