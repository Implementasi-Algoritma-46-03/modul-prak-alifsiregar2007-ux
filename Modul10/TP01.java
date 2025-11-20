public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        int putaran = 5;

        for (int i = putaran; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}