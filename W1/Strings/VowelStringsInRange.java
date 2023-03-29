package W1.Strings;

public class VowelStringsInRange {

    public static boolean checkingWord(String s) {
        return checkVowel(s.charAt(0)) && checkVowel(s.charAt(s.length() - 1));
    }

    public static boolean checkVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {

        String[] s={"aldahi","ala","odhni","kxddkv","pwofqu"};
        int l=0,r=3;
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (checkingWord(s[i])) count++;
        }
        System.out.println(count);;

    }
}
