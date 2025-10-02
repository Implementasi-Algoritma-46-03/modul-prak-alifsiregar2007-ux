import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner tugas2 = new Scanner(System.in);

        int nilai1 = tugas2.nextInt();
        int nilai2 = tugas2.nextInt();
        int nilai3 = tugas2.nextInt();

        double jumlah = (nilai1 + nilai2 + nilai3) / 3;
        System.out.print("Nilai rata-rata: ");
        System.out.printf("%.2f", jumlah);

        tugas2.close();
    }
}