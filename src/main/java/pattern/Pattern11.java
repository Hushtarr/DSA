package pattern;

/*
    *
   **
  ***
 ****
*****

*/
public class Pattern11 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for (int row = 0; row < n; row++) {
            for (int space = 0; space <n-row ; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star <=row ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
