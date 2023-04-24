package org.example.Behavioral.Template;

public abstract class CarTemplate {

    protected int power;
    protected String name;

    public CarTemplate(String name){
        this.name=name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void chassy();
    public abstract void engine();
    public abstract void wheels();

    public void manufactureCar() {
        chassy();
        engine();
        wheels();
    }
}
