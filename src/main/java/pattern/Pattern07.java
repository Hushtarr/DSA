package pattern;

/*
 * * * * *
  * * * *
   * * *
    * *
     *
 */
public class Pattern07 {
    public static void main(String[] args) {
        print1(5);

    }

    public static void print1(int n) {
        for (int row = 1; row <=n; row++) {

            for (int columnSpace = 1; columnSpace <row; columnSpace++) {
                System.out.print(" ");
            }
            for (int columnStar = 0; columnStar <=n-row ; columnStar++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
