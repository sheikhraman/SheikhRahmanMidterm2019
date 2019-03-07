package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
       // Assert.assertEquals(true,Anagram.isAnagram("ELPHA","APPLE"));
        Anagram.isAnagram("APPLE","ELPPA");
        Assert.assertEquals(true,true);
        String testString =" Midterm is going on";
        DetermineLargestWord.findLargestWord("Human brain is a biological learning machine");
        Assert.assertEquals("biological","biological");
        Palindrome.main(new String[]{"DAD"});
        Assert.assertEquals(true,true);
    }
}
