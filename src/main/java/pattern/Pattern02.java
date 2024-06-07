package pattern;

/*

 *
 * *
 * * *
 * * * *
 * * * * *


 */

public class Pattern02 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int row)
    {
        String a ="* ";
        for (int i = 0; i < row; i++) { //outer loop, define rows
            for (int j = 0; j <=i; j++) { //inner loop,define lines
                System.out.print(a);
            }
            System.out.println();
        }
    }

    }

