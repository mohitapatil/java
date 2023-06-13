package com.sapient.utility;

import com.sapient.threads.AnimateNameThread;

import java.util.Scanner;

public class AnimateApp {
    public static void main(String[] args){
        Thread thread = new Thread(new AnimateNameThread("Mohit"));
        thread.start();
        Scanner scanner= new Scanner(System.in);
        System.out.println("\nDo you want ot stop?");
        String value= scanner.nextLine();
        if(value!=null)
            thread.interrupt();
    }
}
