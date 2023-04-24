package org.example.Behavioral.ChaninOfResponsibility;

import java.util.Scanner;

public class ATMDispenseChain {
    private DispenseChain c1;

    public ATMDispenseChain() {
        // initialize the chain
        this.c1 = new Dispense50Dollar();
        DispenseChain c2 = new Dispense20Dollar();
        DispenseChain c3 = new Dispense5Dollar();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 5 != 0) {
                System.out.println("Amount should be in multiple of 5.");
                return;
            }
            atmDispenser.c1.dispense(new Currency(amount));
        }

    }
}
