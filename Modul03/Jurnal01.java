import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner tugas1 = new Scanner(System.in);

        int uang = tugas1.nextInt();
        
        int jumlah = uang / 1000;
        
        System.out.println(jumlah);

        int sisa = uang % 1000;

        System.out.println(sisa);

        tugas1.close();
    }
}