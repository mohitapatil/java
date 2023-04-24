package org.example.Builder;

import java.lang.reflect.Field;

public class Phone {

    private String name;
    private int ram;
    private int storage;
    private int screenSize;
    private boolean foldable;
    private int cameraPixel;

    private Phone(PhoneBuilder phoneBuilder){
        this.name= phoneBuilder.name;
        this.ram = phoneBuilder.ram;
        this.storage = phoneBuilder.storage;
        this.screenSize = phoneBuilder.screenSize;
        this.foldable = phoneBuilder.foldable;
        this.cameraPixel = phoneBuilder.cameraPixel;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", screenSize=" + screenSize +
                ", foldable=" + foldable +
                ", cameraPixel=" + cameraPixel +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public boolean isFoldable() {
        return foldable;
    }

    public int getCameraPixel() {
        return cameraPixel;
    }

    public static class PhoneBuilder{

        private String name;
        private int ram;
        private int storage;
        private int screenSize;
        private boolean foldable;
        private int cameraPixel;

        public PhoneBuilder(String name,int ram, int storage){
            this.name = name;
            this.ram= ram;
            this.storage = storage;
        }

        public PhoneBuilder screenSize(int screenSize){
            this.screenSize = screenSize;
            return this;
        }

        public PhoneBuilder foldable(boolean foldable){
            this.foldable = foldable;
            return this;
        }

        public PhoneBuilder cameraPixel(int cameraPixel){
            this.cameraPixel = cameraPixel;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }

}
