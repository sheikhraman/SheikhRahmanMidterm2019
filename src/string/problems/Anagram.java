package string.problems;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String a = "APPLE";
        String  e = "ELPHA";
        System.out.println(isAnagram(a,e));

    }
    public static boolean isAnagram (String st, String sts){
        if(st.length()  !=sts.length()){
            return  false;
        }
        st=st.toUpperCase();
        sts=sts.toUpperCase();
        char[]strs=st.toCharArray();
        Arrays.sort(strs);
        char[] starss =sts.toCharArray();
        Arrays.sort(starss);
        return Arrays.equals(strs,starss);
    }
}
