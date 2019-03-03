package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
         int n =0,n1=2,count =40;
         for (int i=0;i<count;i++){
             int sum =n+n1;
             n=n1;
             n1=sum;
             System.out.println("Fibonacci :"+sum);
         }


    }
}
