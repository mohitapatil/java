package org.example.Creational.Factory.Singelton;

import java.io.*;

public class SingeltonLazy implements Serializable, Cloneable  {

    private static SingeltonLazy singeltonLazy;

    private SingeltonLazy(){}

    public static SingeltonLazy getInstance(){
        if(singeltonLazy==null){
            synchronized (SingeltonLazy.class){
                if(singeltonLazy==null){
                    singeltonLazy= new SingeltonLazy();
                }
            }
        }
        return singeltonLazy;
    }

    protected Object readResolve() {
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
}

class SingletonSerializedTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
        SingeltonLazy instance1 = SingeltonLazy.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instance1);
        out.close();

        // deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SingeltonLazy instance2 = (SingeltonLazy) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + instance1.hashCode());
        System.out.println("instanceTwo hashCode=" + instance2.hashCode());

        SingeltonLazy instance3 = SingeltonLazy.getInstance();
        SingeltonLazy instance4 = (SingeltonLazy)instance3.clone();

        System.out.println("instance1 hashCode:- "+ instance3.hashCode());
        System.out.println("instance2 hashCode:- "+ instance4.hashCode());

    }
}
