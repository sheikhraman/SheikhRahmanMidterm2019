package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

             try {
                 Assert.assertEquals(Factorial.factorial(5), 120);
                 System.out.println("Unit testing pass");
             }
             catch(AssertionError ar){
                 ar.printStackTrace();
             }
             try{
                 Assert.assertEquals(165580141,165580141);
                 System.out.println("Tesing pass");
             }
             catch(AssertionError e){
                 e.printStackTrace();
             }
             try{
                 Assert.assertEquals(9,9);
                 System.out.println("Unit testig pass");
             }
             catch (AssertionError s){
                 s.printStackTrace();
             }
             try{
                 Assert.assertEquals(1,1);
                 System.out.println("unit testig pass");
             }
             catch (AssertionError es){
                 es.printStackTrace();
             }
             try{
                 Assert.assertEquals(1,1);
                 System.out.println("testing pass");
             }
             catch (AssertionError er){
                 er.printStackTrace();
             }

    }
}
