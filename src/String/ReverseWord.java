package String;

import java.util.*;
public class ReverseWord {
public static void main(String[] args) {
       // String input="I like you";
        String input="Hashset bin";  //teshsaH nib //bin Hashset 

        System.out.println(input);
        String output="";
        String []word=input.split(" ");
        for(String words:word) {
        String rewWord="";
        for(int i=words.length()-1;i>=0;i--) {
        rewWord+=words.charAt(i);
        }
        output+=rewWord+" ";
        }
        System.out.println(output);
      }
    }
