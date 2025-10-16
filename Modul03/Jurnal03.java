import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner tugas3 = new Scanner(System.in);

        int niprak = tugas3.nextInt();
        int niases = tugas3.nextInt();
        int niakhir = tugas3.nextInt();

        double jumlah = niprak * 0.25 + niases * 0.35 + niakhir * 0.40;
        System.out.printf("%.2f\n", jumlah);

        boolean nilaiakhir = jumlah > 75;
        System.out.println("Lulus MK: " + nilaiakhir);

        tugas3.close();
    }
}