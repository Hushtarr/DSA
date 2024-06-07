package pattern;
/*
1
22
333
4444
55555
*/
public class Pattern04 {
    public static void main(String[] args) {
    print(5);
    }
    public static void print(int row) {
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i); //(i)-> element of outer loop
            }
            System.out.println();
        }
    }
}
