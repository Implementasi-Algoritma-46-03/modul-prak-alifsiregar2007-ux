import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int Kodemenu = s.nextInt();
        int jumlahmakanan = s.nextInt();
        
        String menu = "";
        int harga = 0;

        switch (Kodemenu) {
            case 1: menu = "Nasi Goreng"; harga = 15000; break;
            case 2: menu = "Mie Goreng"; harga = 12000; break;
            case 3: menu = "Ayam Bakar"; harga = 20000; break;
            case 4: menu = "Kwetiaw"; harga = 13000; break;
            case 5: menu = "Sate Ayam"; harga = 25000; break;
        }
        
        int totalharga = harga * jumlahmakanan;
        System.out.println( menu + " " + jumlahmakanan + " buah, total harga Rp." + totalharga);       
        s.close();

    }
}
