package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {
      static int fac =1;
    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num =5;

        Factorial ft =new Factorial();
        ft.factorial(fac);
        System.out.println(fac);

    }

    public static int  factorial(int num) {
        if(num>=1) {
            fac = fac * num;
            factorial(num - 1);
        }
        return fac;
    }
}
