package org.example.Behavioral.Template;

public class ClassicCar extends CarTemplate{

    public ClassicCar(String name) {
        super(name);
    }

    @Override
    public void chassy() {
        System.out.println("Make Classic "+ getName()+" chassis");
    }

    @Override
    public void engine() {
        this.power= 300;
        System.out.println("Add classic petrol engine of "+ this.power +"HP");
    }

    @Override
    public void wheels() {
        System.out.println("Add classic wheels. ");
    }
}
