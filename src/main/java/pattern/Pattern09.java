package pattern;

/*

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

 */
public class Pattern09 {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n)
    {
        for (int row = 0; row <= 2*n-1; row++) {
            if (row <= n) {

            for (int column = 0; column < row; column++) {
                System.out.print("* ");
            }
            }


            else {
                for (int column = 0; column <2*n-row ; column++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
