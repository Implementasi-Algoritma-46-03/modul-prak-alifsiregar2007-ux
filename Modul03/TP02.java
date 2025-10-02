import java.util.Scanner;
public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner inputScanner = new Scanner(System.in);
        
        String NamaPembeli = inputScanner.nextLine();
        int hargaPerBarang = inputScanner.nextInt();
        int jumlahBarang = inputScanner.nextInt();

        int TotalBelanja = jumlahBarang * hargaPerBarang;

        System.out.println("Hi, "+ NamaPembeli + ". Total belanja adalah " + TotalBelanja + " rupiah.");
        inputScanner.close();

    }
}
