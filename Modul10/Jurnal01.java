public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini 
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
} 