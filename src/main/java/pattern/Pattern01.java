package pattern;
/*
    *****
    *****
    *****
*/


public class Pattern01 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int row)
    {
        String a ="* ";
        for (int i = 0; i < row; i++) { //outer loop, define rows
            for (int j = 0; j < 5; j++) { //inner loop,define lines
                System.out.print(a); // 5 times "*" -> line
            }
            System.out.println(); // line break
        }
    }
}
