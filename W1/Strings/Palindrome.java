package W1.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s1= "qwertrewq";
        String s2= "";
        int l = s1.length();
        for (int i = (l - 1); i >=0; --i) {
        s2 = s2 + s1.charAt(i);
        }
        if (s1.equals(s2)) {
        System.out.println(s1 + " -- is Palindrome");
        }
        else {
        System.out.println(s1 + " -- is not a Palindrome");
        }
    }
}
