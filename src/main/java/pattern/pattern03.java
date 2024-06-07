package pattern;


/*
1
12
123
1234
12345
 */

public class pattern03 {
    public static void main(String[] args) {
    print(5);
    }

    public static void print(int row) {
        for (int i = 1; i <=row; i++) { //outer loop, define rows
            for (int j = 1; j <=i; j++) { //inner loop,define lines
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
