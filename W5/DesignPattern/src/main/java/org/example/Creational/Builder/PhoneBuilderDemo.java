package org.example.Builder;

public class PhoneBuilderDemo {

    public static void main(String[] args) {
        Phone myPhone= new Phone.PhoneBuilder("MySamsung",8,64).build();

        Phone mySecondPhone = new Phone.PhoneBuilder("Pixel",16,256)
                .screenSize(6)
                .foldable(false)
                .cameraPixel(12)
                .build();

        System.out.println( myPhone.toString());
        System.out.println(mySecondPhone.toString());
    }
}
