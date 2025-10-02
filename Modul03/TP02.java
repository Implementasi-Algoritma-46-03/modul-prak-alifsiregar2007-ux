import java.util.Scanner;
public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Masukan Nama Pembeli");
        String NamaPembeli = inputScanner.nextLine();
        System.out.println("Masukan Harga Per Barang");
        int hargaPerBarang = inputScanner.nextInt();
        System.out.println("Masukan Jumlah Barang");
        int jumlahBarang = inputScanner.nextInt();

        int TotalBelanja = jumlahBarang * hargaPerBarang;

        System.out.println("Hello, "+ NamaPembeli + ". Total Belanja Anda Adalah: " + TotalBelanja + ".");

        inputScanner.close();

    }
}
