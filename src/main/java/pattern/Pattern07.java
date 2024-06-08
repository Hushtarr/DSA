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

            for (int space = 1; space <row; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star <=n-row ; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
