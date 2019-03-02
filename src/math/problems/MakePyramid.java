package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        int i,j,k;
        for(i=0;i<10;i++) {
            for(j=0;j<10-i;j++) {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }
  }
