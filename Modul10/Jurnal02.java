import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini 
        Scanner input = new Scanner(System.in);

        int bilanganBulat = input.nextInt();

        for (int i = 1; i <= bilanganBulat; i++) {
            for (int j = 1; j <= bilanganBulat; j++) {
                System.out.print(i * j + " ");
            }

            System.out.println();
        }

        input.close();
    }
} 