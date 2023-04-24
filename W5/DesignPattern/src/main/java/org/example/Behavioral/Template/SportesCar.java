package org.example.Behavioral.Template;

public class SportesCar extends CarTemplate{
    public SportesCar(String name) {
        super(name);
    }

    @Override
    public void chassy() {
        System.out.println("Make Sports "+ getName()+"  chassis");
    }

    @Override
    public void engine() {
        this.power= 800;
        System.out.println("Add sports engine of "+ getPower() +"HP");
    }

    @Override
    public void wheels() {
        System.out.println("Add sports wheels. ");
    }
}
