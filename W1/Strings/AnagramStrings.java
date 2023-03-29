package W1.Strings;

import java.util.Arrays;

public class AnagramStrings {

    public static void isAnagram(String s1, String s2){
        if(s1.length()!= s2.length()){
            System.out.println("Not Anagram");
            return;
        }
        char[] S1 = s1.toLowerCase().toCharArray();  
        char[] S2 = s2.toLowerCase().toCharArray();  
        Arrays.sort(S1);  
        Arrays.sort(S2);
        if(Arrays.equals( S1,S2)){
            System.out.println("Anagram");
        }
        else System.out.println("Not Anagram");
    }

    public static void main(String[] args)
    {
        String s1="qwerrTyy";
        String s2="tyryewqr";

        isAnagram(s1,s2);
    }
}
