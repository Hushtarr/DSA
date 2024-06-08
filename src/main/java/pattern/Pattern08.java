package pattern;

public class Pattern08 {
    public static void main(String[] args) {
        print(5);
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
}
