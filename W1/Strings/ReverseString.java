package W1.Strings;

public class ReverseString {
    // Reverse a string without using jdk api & without extra space.

    public static void main(String[] args)
    {
    String s= "qwert keybord is ok";

    int l=s.length();
    

    for(int i=0;i<l;i++){
        s= s.substring(1, s.length() - i)+ s.substring(0, 1)+ s.substring(s.length() - i, s.length());
        // s= s.substring(0, i)+ s.substring(l-i-1, l-i-1)+s.substring(i+1, l-i-1) +  s.substring(i, i)+ s.substring(i+1, l-1);
    }
    System.out.println(s);

}

}
