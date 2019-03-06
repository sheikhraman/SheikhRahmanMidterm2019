package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args){
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String[]words = wordGiven.split(" ");
        String st = "";
        //implement
        int max =0;
        for(int i=0;i<words.length-1;i++)
            if(words[i].length()<words[i+1].length()){
                max = words[i+1].length();
                st = words[i+1];
            }
          map.put(max,st);
            for(Map.Entry entry: map.entrySet())
                System.out.println(entry.getKey()+ ""+entry.getValue());
        return map;
    }
}
