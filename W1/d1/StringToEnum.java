package W1.d1;
import java.util.Scanner;

public class StringToEnum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enums: [CO1,CO2,CO3]");
        System.out.println("Enter required enum string: ");

        String name = sc.nextLine();
        en e = en.valueOf(name.toUpperCase());
        System.out.println(e.getInt());
     }
}

enum en{
    CO1(1),CO2(2),CO3(3);

    private int i;

    en(int i){
        this.i=i;
    }

    public int getInt(){
        return i;
    }

}
