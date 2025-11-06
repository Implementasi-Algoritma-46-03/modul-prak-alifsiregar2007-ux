import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner rs = new Scanner (System.in);
        double ratarata;
        double nilai;
        double jumlah = 0;
        int total = 0;

        while (true) {
            nilai = rs. nextInt();
            if (nilai == 0) {
                break;
            }
            jumlah++;
            total += nilai;
        }
        ratarata = ((double) total / (double) jumlah);
        System.out.printf ("%.2f%n", ratarata);
    }
}
