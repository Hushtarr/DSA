package pattern;
/*
54321
4321
321
21
1
--------------------------------
12345
1234
123
12
1


*/

public class Pattern05 {
    public static void main(String[] args) {
        print1(5);
        System.out.println();
        print2(5);
    }
    public static void print1(int row) {
        for (int i = row; i >=1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void print2(int row) {
        for (int i = row; i >=1; i--) { // 54321 it will not be printed cuz it will be start with 5 each line
            for (int j = 1; j <=i; j++) { // each line start with 1,12345,1234... j <=i define descending order
                System.out.print(j);
            }
            System.out.println();
        }
    }

}