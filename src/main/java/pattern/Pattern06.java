package pattern;
/*
    *
   * *
  * * *
 * * * *
* * * * *
*/
public class Pattern06 {
    public static void main(String[] args) {
        print1(5);

    }

    public static void print1(int n) {
        for (int row = 1; row <=n; row++) {
            //
            for (int columnSpace = 1; columnSpace <= n-row; columnSpace++) {
                System.out.print(" ");
            }
            for (int columnStar = 1; columnStar <= row; columnStar++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}