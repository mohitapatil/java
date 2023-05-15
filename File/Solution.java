import java.io.*;
import java.util.*;

/**
* Pangram FInder
*
* The sentence "The quick brown fox jumps over the lazy dog" contains
* every single letter in the alphabet. Such sentences are called pangrams.
* Write a function findMissingLetters, which takes a String `sentence`,
* and returns all the letters it is missing
*
*/
class Solution {

  private static class PanagramDetector {
  private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

  public String findMissingLetters(String sentence) {
    String s="";
    if(sentence.length()==0)return ALPHABET;

    // for(int i=0;i<ALPHABET.length();i++){
    // if(sentence.indexOf(ALPHABET.charAt(i))==-1){
    //     s.concat(String.valueOf(ALPHABET.charAt(i)));
    // }
    // }
    for(int i=0;i<ALPHABET.length();i++){
      if(!sentence.contains(String.valueOf(ALPHABET.charAt(i)))){
        s+=ALPHABET.charAt(i);
      }
    }
    System.out.println(s);
    return s;


  }

  }

  public static void main(String[] args) {
  PanagramDetector pd = new PanagramDetector();
  boolean success = true;

  success = success && "".equals(pd.findMissingLetters("The quick brown fox jumps over the lazy dog"));
  success = success && "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));

  if (success) {
    System.out.println("Pass ");
  } else {
    System.out.println("Failed");
  }
  }
}
