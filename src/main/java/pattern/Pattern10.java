package pattern;
/*
 * * * * *
  * * * *
   * * *
    * *
     *
    * *
   * * *
  * * * *
 * * * * *

*/
public class Pattern10 {
    public static void main(String[] args) {
        print(5);
        System.out.println("--------------------------------");
        print1(5);
    }
    static void print(int n) {
        for (int row = 1; row <=2*n-1 ; row++) {
            if (row<=n){
                for (int space = 0; space <row-1 ; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star <=n-row ; star++) {
                    System.out.print("* ");
                }
            }

            else {
                for (int space = 0; space < 2*n-row-1; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star < row-n+1; star++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    static void print1(int n){
        for (int row = 1; row <=2*n-1 ; row++) {
            for (int space = 0; space < (row<n? row-1 : 2*n-row-1)  ; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < (row<n? n-row+1:row-n+1) ; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
