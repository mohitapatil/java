package W1.Strings;

public class RemovePalindrome {
    public static void main(String[] args) {

        String s="ababa";
        if(s.isEmpty())
            System.out.println(0);
        boolean isPalin = true;
        for(int i=0;i<s.length()/2;i++)
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                isPalin = false;
        
        if(isPalin == true)
        System.out.println(1);
        else
        System.out.println(2);
    }
}
