package pattern;
/*    *
     * *
    * * *
   * * * *
  * * * * *
   * * * *
    * * *
     * *
      *
 */

public class Pattern08 {
    public static void main(String[] args) {
        print(5);
        System.out.println();
        print2(5);
        System.out.println();
        print3(5);
    }

    static void print(int n)
    {
        for (int row = 1; row <= 2*n-1; row++) {
            if(row<=n){
            for (int columnSpace = 0; columnSpace < n-row; columnSpace++) {
                System.out.print(" ");
            }
            for (int columnStar = 0;columnStar<row; columnStar++) {
                System.out.print("* ");
            }
            }

            else {
                for (int columnSpace = 0; columnSpace < row - n; columnSpace++) {
                    System.out.print(" ");
                }
                for (int columnStar = 0; columnStar < 2 * n - row; columnStar++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void print2(int n){
        for (int row = 1; row < 2*n; row++) {
            int totalSp = row <n ? n - row : row - n;
            int totalSt = row <= n ? row : 2 * n - row;

            for (int i = 0; i < totalSp; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < totalSt; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void print3(int n){

            for (int row = 0; row < 2*n; row++) {
                for (int i = 0; i < (row < n ? n - row : row - n); i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < (row <= n ? row : 2 * n - row); i++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

    }
}
