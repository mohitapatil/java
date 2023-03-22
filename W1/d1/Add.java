package W1.d1;

import java.util.Scanner;

public class Add {

    public static void main(String args[]){
        int a,b=0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter 1st no:");
            a=scan.nextInt();
            System.out.println("Enter 2nd no:");
            b=scan.nextInt();
        }
        System.out.println(a+b);
    }
}
