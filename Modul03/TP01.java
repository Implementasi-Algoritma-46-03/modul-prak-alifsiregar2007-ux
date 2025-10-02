import java.util.Scanner;
public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
         Scanner inputScanner = new Scanner(System.in);

        int SaldoAwal = inputScanner.nextInt();
        int TabunganPerhari = inputScanner.nextInt();
        int JumlahHari = inputScanner.nextInt();

        int totalTabungan = SaldoAwal + (TabunganPerhari * JumlahHari);

        System.out.println(totalTabungan);
        
        inputScanner.close();
    }
}
