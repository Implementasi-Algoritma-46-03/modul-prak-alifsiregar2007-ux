import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i - 1; k++) { 
                System.out.print(" "); 
            }
            
            System.out.println(i);
        }

        for (int i = n - 1; i >= 1; i--) { 
            for (int k = 1; k <= i - 1; k++) { 
                System.out.print(" "); 
            }
            System.out.println(i); 
        }
        input.close();
    }
}