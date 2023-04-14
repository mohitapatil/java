package W2;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args)
    {
        String str = "qwertytrewertyuioiuytrew";
        String test = "";
        int maxLength = -1;
        if (str.length() == 1) {
            System.out.println(1);
            return;
        }
        for (char c : str.toCharArray()) {
            String cur = String.valueOf(c);
            if (test.contains(cur)) {
                test = test.substring(test.indexOf(cur)+ 1);
            }
            test = test + String.valueOf(c);
            maxLength = Math.max(test.length(), maxLength);
        }
        System.out.println(maxLength);
    }
}
