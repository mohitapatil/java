package W1.Strings;

import java.util.*;

public class MatchingSubsequence {

    public static Map<Character, List<Integer>> map = new HashMap<>();
    public static void main(String[] args) {
    
        String S = "abcdefghijkllmnop";
        String[] arr = {"a","ack","glo","mmp","allm","abz"};

        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            List<Integer> list = map.containsKey(c) ? map.get(c): new ArrayList<>();
            list.add(i);
            map.put(c, list);
        }
        int res = 0;
        for(String s : arr){
            if(match(s)) {res++;System.out.println(s);}
        }
        System.out.println(res);
    }

    private static boolean match(String s) {
        char[] arr = s.toCharArray();
        int pre = -1;
        for(char c : arr){
            if(!map.containsKey(c)) return false;
            List<Integer> list = map.get(c);
            int index = Collections.binarySearch(list, pre + 1);
            if(index < 0) index = -index - 1;
            if(index >= list.size()) return false;
            pre = list.get(index);
        }
        return true;
    }
}
